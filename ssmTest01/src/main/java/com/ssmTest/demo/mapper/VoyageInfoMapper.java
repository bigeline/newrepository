package com.ssmTest.demo.mapper;

import com.ssmTest.demo.entity.VoyageInfo;
import com.ssmTest.demo.entity.VoyageInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VoyageInfoMapper {
    long countByExample(VoyageInfoExample example);

    int deleteByExample(VoyageInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VoyageInfo record);

    int insertSelective(VoyageInfo record);

    List<VoyageInfo> selectByExample(VoyageInfoExample example);

    VoyageInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VoyageInfo record, @Param("example") VoyageInfoExample example);

    int updateByExample(@Param("record") VoyageInfo record, @Param("example") VoyageInfoExample example);

    int updateByPrimaryKeySelective(VoyageInfo record);

    int updateByPrimaryKey(VoyageInfo record);
}