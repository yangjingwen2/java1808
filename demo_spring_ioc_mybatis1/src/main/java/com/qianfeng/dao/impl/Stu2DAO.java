package com.qianfeng.dao.impl;

import com.qianfeng.TbStudent;
import com.qianfeng.dao.IStuDAO;
import com.qianfeng.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stu2DAO implements IStuDAO {

    @Autowired
    private SqlSession session;

    @Override
    public TbStudent queryStudentById(Long stuId) {
        TbStudent tbStudent = session.getMapper(StudentMapper.class).queryStuById(stuId);
        return tbStudent;
    }
}
