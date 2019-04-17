package com.qianfeng.book.mapper;

import com.qianfeng.book.po.TbBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    List<TbBook> queryBookByPage();

    void save(TbBook book);
}
