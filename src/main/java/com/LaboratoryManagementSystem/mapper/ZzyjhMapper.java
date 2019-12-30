package com.LaboratoryManagementSystem.mapper;

import com.LaboratoryManagementSystem.entity.Zzyjh;
import com.LaboratoryManagementSystem.entity.ZzyjhExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZzyjhMapper {
    long countByExample(ZzyjhExample example);

    int deleteByExample(ZzyjhExample example);

    int deleteByPrimaryKey(String zzyjhId);

    int insert(Zzyjh record);

    int insertSelective(Zzyjh record);

    List<Zzyjh> selectByExample(ZzyjhExample example);

    Zzyjh selectByPrimaryKey(String zzyjhId);

    int updateByExampleSelective(@Param("record") Zzyjh record, @Param("example") ZzyjhExample example);

    int updateByExample(@Param("record") Zzyjh record, @Param("example") ZzyjhExample example);

    int updateByPrimaryKeySelective(Zzyjh record);

    int updateByPrimaryKey(Zzyjh record);
}