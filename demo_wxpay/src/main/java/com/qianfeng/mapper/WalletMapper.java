package com.qianfeng.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WalletMapper {

    int queryBalance();

    void frozenMoney(@Param("frozen") int money);
}
