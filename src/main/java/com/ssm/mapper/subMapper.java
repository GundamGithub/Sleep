package com.ssm.mapper;

import com.ssm.entity.sub;
import org.apache.ibatis.annotations.Param;

public interface subMapper {
    public int insertSub(@Param("sub") sub sub);
}
