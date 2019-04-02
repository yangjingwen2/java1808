package com.qianfeng;

import com.qianfeng.dao.impl.StuDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        final StuDAO stuDAO = applicationContext.getBean(StuDAO.class);
        //线程1
        new Thread(new Runnable() {
            @Override
            public void run() {

                StuDAO stuDAO = applicationContext.getBean(StuDAO.class);
                TbStudent tbStudent = stuDAO.queryStudentById(14L);
                System.out.println("线程1："+tbStudent.getStuName());
            }
        }).start();

        //线程2
        new Thread(new Runnable() {
            @Override
            public void run() {
                StuDAO stuDAO = applicationContext.getBean(StuDAO.class);
                TbStudent tbStudent = stuDAO.queryStudentById(14L);
                System.out.println("线程2："+tbStudent.getStuName());
            }
        }).start();
    }
}
