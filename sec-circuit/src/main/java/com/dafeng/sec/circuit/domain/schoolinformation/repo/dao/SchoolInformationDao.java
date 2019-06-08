package com.dafeng.sec.circuit.domain.schoolinformation.repo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dafeng.sec.circuit.domain.schoolinformation.entity.SchoolInformation;
import com.dafeng.sec.circuit.domain.schoolinformation.entity.example.SchoolInformationExample;

public interface SchoolInformationDao {
    long countByExample(SchoolInformationExample example);

    int deleteByExample(SchoolInformationExample example);

    int insert(SchoolInformation record);

    int insertSelective(SchoolInformation record);

    List<SchoolInformation> selectByExample(SchoolInformationExample example);

    int updateByExampleSelective(@Param("record") SchoolInformation record, @Param("example") SchoolInformationExample example);

    int updateByExample(@Param("record") SchoolInformation record, @Param("example") SchoolInformationExample example);
}