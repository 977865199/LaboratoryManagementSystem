package com.LaboratoryManagementSystem.mapper;

import com.LaboratoryManagementSystem.entity.Rzyjh;
import com.LaboratoryManagementSystem.entity.RzyjhExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RzyjhMapper {
    long countByExample(RzyjhExample example);

    int deleteByExample(RzyjhExample example);

    int deleteByPrimaryKey(String rzyjhId);

    int insert(Rzyjh record);

    int insertSelective(Rzyjh record);

    List<Rzyjh> selectByExample(RzyjhExample example);

    Rzyjh selectByPrimaryKey(String rzyjhId);

    int updateByExampleSelective(@Param("record") Rzyjh record, @Param("example") RzyjhExample example);

    int updateByExample(@Param("record") Rzyjh record, @Param("example") RzyjhExample example);

    int updateByPrimaryKeySelective(Rzyjh record);

    int updateByPrimaryKey(Rzyjh record);
}