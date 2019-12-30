package com.LaboratoryManagementSystem.mapper;

import com.LaboratoryManagementSystem.entity.Yzyjh;
import com.LaboratoryManagementSystem.entity.YzyjhExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YzyjhMapper {
    long countByExample(YzyjhExample example);

    int deleteByExample(YzyjhExample example);

    int deleteByPrimaryKey(String yzyjhId);

    int insert(Yzyjh record);

    int insertSelective(Yzyjh record);

    List<Yzyjh> selectByExample(YzyjhExample example);

    Yzyjh selectByPrimaryKey(String yzyjhId);

    int updateByExampleSelective(@Param("record") Yzyjh record, @Param("example") YzyjhExample example);

    int updateByExample(@Param("record") Yzyjh record, @Param("example") YzyjhExample example);

    int updateByPrimaryKeySelective(Yzyjh record);

    int updateByPrimaryKey(Yzyjh record);
}