package com.LaboratoryManagementSystem.mapper;

import com.LaboratoryManagementSystem.entity.Server;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ServerMapper extends BaseMapper<Server> {


    List<Server> findAll(@Param("queryType") String queryType,
                         @Param("queryKeywords") String queryKeywords, Pagination pagination);

    Integer releaseOuttime(@Param("now") Long now);

    List<Server> findOuttime(@Param("now") Long now);

    Integer applyOuttime(@Param("now") Long now);
}


