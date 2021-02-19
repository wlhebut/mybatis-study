package com.ta.mapper;

import com.ta.pojo.TblResource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TblResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TblResource record);

    int insertSelective(TblResource record);

    TblResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TblResource record);

    int updateByPrimaryKey(TblResource record);
}