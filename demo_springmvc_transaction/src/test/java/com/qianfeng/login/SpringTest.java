package com.qianfeng.login;

import com.qianfeng.book.po.TbAuthor;
import com.qianfeng.book.po.TbBook;
import com.qianfeng.book.service.BookService;
import com.qianfeng.user.po.TbUser;
import com.qianfeng.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {

    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;

    @Test
    public void testCase1(){
//        TbUser tbUser = null;
//        try {
//            tbUser = userService.login("zhangsan", "123");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(tbUser);
    }
    @Test
    public void testCase2(){
        TbAuthor tbAuthor = new TbAuthor();
        tbAuthor.setAuthorName("千锋6");
        TbBook tbBook = new TbBook();
        tbBook.setBookName("千锋6Java从入门到放弃");
        tbBook.setAuthor(tbAuthor);
        try {
            bookService.save(tbBook);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
