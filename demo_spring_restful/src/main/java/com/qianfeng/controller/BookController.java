package com.qianfeng.controller;

import com.qianfeng.bean.BookInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * REST架构风格的Controller
 * 特点：每一个方法默认返回json对象
 */
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
}
