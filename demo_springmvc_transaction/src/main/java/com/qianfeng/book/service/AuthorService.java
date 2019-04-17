package com.qianfeng.book.service;

import com.qianfeng.book.mapper.AuthorMapper;
import com.qianfeng.book.po.TbAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorService {

    @Autowired
    private AuthorMapper authorMapper;

    /**
     * 事务传播性的配置：propagation = Propagation.REQUIRES_NEW
     *  Propagation.REQUIRES_NEW：表示会新建事务。不会延用上一级方法的事务。
     * @param tbAuthor
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int save(TbAuthor tbAuthor){
//       if (1==1){
//            throw new NullPointerException("故意的");
//        }
       return authorMapper.save(tbAuthor);
    }
}
