package com.qianfeng;

import com.qianfeng.dao.IStuDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {

    @Autowired
    private IStuDAO stuDAO;

    @Test
    public void testCase1(){
        TbStudent tbStudent = stuDAO.queryStudentById(14L);
        System.out.println(tbStudent.getStuName());
    }
}
