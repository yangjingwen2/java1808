package com.qianfeng.book.mapper;

import com.qianfeng.book.po.TbAuthor;
import org.apache.ibatis.annotations.Mapper;

import javax.swing.plaf.ToolBarUI;

@Mapper
public interface AuthorMapper {

    int save(TbAuthor author);
}
