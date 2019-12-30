package com.LaboratoryManagementSystem.mapper;

import com.LaboratoryManagementSystem.entity.Xmlb;
import com.LaboratoryManagementSystem.entity.XmlbExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XmlbMapper {
    long countByExample(XmlbExample example);

    int deleteByExample(XmlbExample example);

    int deleteByPrimaryKey(String xmlbId);

    int insert(Xmlb record);

    int insertSelective(Xmlb record);

    List<Xmlb> selectByExample(XmlbExample example);

    Xmlb selectByPrimaryKey(String xmlbId);

    int updateByExampleSelective(@Param("record") Xmlb record, @Param("example") XmlbExample example);

    int updateByExample(@Param("record") Xmlb record, @Param("example") XmlbExample example);

    int updateByPrimaryKeySelective(Xmlb record);

    int updateByPrimaryKey(Xmlb record);
}