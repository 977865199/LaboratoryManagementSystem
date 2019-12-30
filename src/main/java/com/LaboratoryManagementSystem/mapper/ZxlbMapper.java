package com.LaboratoryManagementSystem.mapper;

import com.LaboratoryManagementSystem.entity.Zxlb;
import com.LaboratoryManagementSystem.entity.ZxlbExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZxlbMapper {
    long countByExample(ZxlbExample example);

    int deleteByExample(ZxlbExample example);

    int deleteByPrimaryKey(String zxlbId);

    int insert(Zxlb record);

    int insertSelective(Zxlb record);

    List<Zxlb> selectByExample(ZxlbExample example);

    Zxlb selectByPrimaryKey(String zxlbId);

    int updateByExampleSelective(@Param("record") Zxlb record, @Param("example") ZxlbExample example);

    int updateByExample(@Param("record") Zxlb record, @Param("example") ZxlbExample example);

    int updateByPrimaryKeySelective(Zxlb record);

    int updateByPrimaryKey(Zxlb record);
}