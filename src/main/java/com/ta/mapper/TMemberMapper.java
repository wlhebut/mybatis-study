package com.ta.mapper;

import com.ta.pojo.TMember;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TMemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMember record);

    int insertSelective(TMember record);

    TMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMember record);

    int updateByPrimaryKey(TMember record);
}