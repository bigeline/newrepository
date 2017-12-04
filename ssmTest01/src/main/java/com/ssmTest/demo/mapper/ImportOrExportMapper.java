package com.ssmTest.demo.mapper;

import com.ssmTest.demo.entity.ImportOrExport;
import com.ssmTest.demo.entity.ImportOrExportExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ImportOrExportMapper {
    long countByExample(ImportOrExportExample example);

    int deleteByExample(ImportOrExportExample example);

    int deleteByPrimaryKey(String id);

    int insert(ImportOrExport record);

    int insertSelective(ImportOrExport record);

    List<ImportOrExport> selectByExample(ImportOrExportExample example);

    ImportOrExport selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ImportOrExport record, @Param("example") ImportOrExportExample example);

    int updateByExample(@Param("record") ImportOrExport record, @Param("example") ImportOrExportExample example);

    int updateByPrimaryKeySelective(ImportOrExport record);

    int updateByPrimaryKey(ImportOrExport record);
}