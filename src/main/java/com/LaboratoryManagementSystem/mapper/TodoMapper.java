package com.LaboratoryManagementSystem.mapper;

import com.LaboratoryManagementSystem.entity.Todo;
import com.LaboratoryManagementSystem.entity.TodoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TodoMapper {
    long countByExample(TodoExample example);

    int deleteByExample(TodoExample example);

    int deleteByPrimaryKey(String todoId);

    int insert(Todo record);

    int insertSelective(Todo record);

    List<Todo> selectByExample(TodoExample example);

    Todo selectByPrimaryKey(String todoId);

    int updateByExampleSelective(@Param("record") Todo record, @Param("example") TodoExample example);

    int updateByExample(@Param("record") Todo record, @Param("example") TodoExample example);

    int updateByPrimaryKeySelective(Todo record);

    int updateByPrimaryKey(Todo record);
}