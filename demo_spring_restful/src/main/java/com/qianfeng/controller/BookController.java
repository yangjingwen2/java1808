package com.qianfeng.controller;

import com.qianfeng.bean.BookInfo;
import com.qianfeng.bean.JsonResultVO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * REST架构风格的Controller
 * 特点：每一个方法默认返回json对象
 */
@CrossOrigin //允许跨域。。前端解决跨域是jsonp
@RestController
@RequestMapping("book")
public class BookController {

    private List<BookInfo> bookList = new ArrayList<>();

    {
        for (int i = 0; i < 10; i++) {
            BookInfo bookInfo = new BookInfo();
            bookInfo.setBookId(i+1);
            bookInfo.setBookName("射雕英雄传"+i);
            bookList.add(bookInfo);
        }
    }

    /**
     * http://localhost:8081/springmvc/book/1
     * REST风格的地址中的一部分是我们需要的参数
     * REST风格，如果是查询资源，就应该是GET请求
     * @param id
     * @return
     */
    @RequestMapping(value = "{bookId}",method = RequestMethod.GET)
    public BookInfo queryBookById(@PathVariable("bookId") Integer id){
        BookInfo bookInfo = bookList.get(id - 1);
        return bookInfo;
    }

    /**
     * 新增
     * @param bookInfo
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public JsonResultVO save(BookInfo bookInfo){
        bookList.add(bookInfo);
        JsonResultVO jsonResultVO = new JsonResultVO();
        jsonResultVO.setCode(1);
        jsonResultVO.setData("新增成功");
        return jsonResultVO;
    }


    /**
     * delete、put、post、get 都是http协议中的请求策略
     *
     * 浏览器不支持delete、put等
     * @param bookId
     * @return
     */
    @RequestMapping(value = "/{bookId}",method = RequestMethod.DELETE)
    public JsonResultVO delete(@PathVariable("bookId") int bookId){

        bookList.remove(bookId-1);
        JsonResultVO jsonResultVO = new JsonResultVO();
        jsonResultVO.setCode(1);
        jsonResultVO.setData("删除成功");
        return jsonResultVO;
    }

    /**
     * 修改
     * @param bookInfo
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public JsonResultVO update(BookInfo bookInfo){

        bookList.remove(bookInfo.getBookId()-1);
        bookList.set(bookInfo.getBookId()-1,bookInfo);
        JsonResultVO jsonResultVO = new JsonResultVO();
        jsonResultVO.setCode(1);
        jsonResultVO.setData("修改成功");
        return jsonResultVO;
    }

    @RequestMapping(value = "/page/{page}",method = RequestMethod.GET)
    public List<BookInfo> queryBookByPage(@PathVariable("page") int page){
        List<BookInfo> subList = bookList.subList((page - 1)*3, page * 3);
        return subList;
    }
}
