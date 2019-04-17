package com.qianfeng.book.service;

import com.qianfeng.book.mapper.BookMapper;
import com.qianfeng.book.po.TbBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private AuthorService authorService;

    public List<TbBook> queryBookByPage() throws Exception{
        List<TbBook> tbBooks = bookMapper.queryBookByPage();
        return tbBooks;
    }

    /**
     * 新增图书步骤：
     * 1、先新增作者
     * 2、新增图书
     * @param book
     * @throws Exception
     */
    @Transactional //此注解表示，此方法的事务交给Spring管理
    public void save(TbBook book){

        //完成新增图书的操作
        book.setAuthorId(0);
        bookMapper.save(book);

        //新增作者新增，并且需要返回主键
        int authorId = authorService.save(book.getAuthor());
        if (1==1){
            throw new NullPointerException("故意的");
        }
        book.setAuthorId(authorId);

    }
}
