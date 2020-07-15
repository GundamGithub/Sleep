package com.ssm.mapper;

import com.ssm.entity.menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface menuMapper {
    public int insrtMenu(@Param("menu") menu menu);

    public List<menu> findAll();

}
