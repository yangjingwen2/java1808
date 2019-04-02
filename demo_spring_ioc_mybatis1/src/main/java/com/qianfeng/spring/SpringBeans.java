package com.qianfeng.spring;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class SpringBeans {

    //如果此对象不需要注入到其他位置，就不需要交给spring管理
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    @Bean //SqlSessionFactory交给spring管理。spring默认情况下的对象管理是单利的。
    public SqlSessionFactory provideSessionFactory() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    /**
     * 此方法的参数，@bean注解修饰的方法中的参数会由spring自动注入。
     *
     * 注意：
     * 1、保证provideSession每次都执行
     * 2、ThreadLocal
     * @param sqlSessionFactory
     * @return
     */
    @Scope("prototype")
    @Bean
    public SqlSession provideSession(SqlSessionFactory sqlSessionFactory){

        System.out.println(Thread.currentThread().getName());

        //session优化问题？？？
        SqlSession session1 = threadLocal.get();
        if (session1 == null){
            System.out.println("--------------open session-------------");
            session1 = sqlSessionFactory.openSession();
            threadLocal.set(session1);
        }

        return session1;
    }
}
