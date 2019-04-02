package com.qianfeng;

import com.qianfeng.dao.impl.Stu2DAO;
import com.qianfeng.dao.impl.StuDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {


//        final StuDAO stuDAO = applicationContext.getBean(StuDAO.class);
        //线程1
        new Thread(new Runnable() {
            @Override
            public void run() {
                final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
                StuDAO stuDAO = applicationContext.getBean(StuDAO.class);
                TbStudent tbStudent = stuDAO.queryStudentById(14L);
                System.out.println("线程1："+tbStudent.getStuName());

                Stu2DAO stu2DAO = applicationContext.getBean(Stu2DAO.class);
                TbStudent tbStudent2 = stu2DAO.queryStudentById(14L);
                System.out.println("线程2："+tbStudent2.getStuName());

//                //线程2
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//                        Stu2DAO stu2DAO = applicationContext.getBean(Stu2DAO.class);
//                        TbStudent tbStudent = stu2DAO.queryStudentById(14L);
//                        System.out.println("线程2："+tbStudent.getStuName());
//                    }
//                }).start();
            }
        }).start();


    }
}
