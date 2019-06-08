package com.dafeng.sec.circuit.domain.admissionprocess.repo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dafeng.sec.circuit.domain.admissionprocess.entity.AdmissionProcess;
import com.dafeng.sec.circuit.domain.admissionprocess.entity.example.AdmissionProcessExample;

@Mapper
public interface AdmissionProcessDao {
	
    long countByExample(AdmissionProcessExample example);

    int deleteByExample(AdmissionProcessExample example);

    int insert(AdmissionProcess record);

    int insertSelective(AdmissionProcess record);

    List<AdmissionProcess> selectByExampleWithBLOBs(AdmissionProcessExample example);

    List<AdmissionProcess> selectByExample(AdmissionProcessExample example);

    int updateByExampleSelective(@Param("record") AdmissionProcess record, @Param("example") AdmissionProcessExample example);

    int updateByExampleWithBLOBs(@Param("record") AdmissionProcess record, @Param("example") AdmissionProcessExample example);

    int updateByExample(@Param("record") AdmissionProcess record, @Param("example") AdmissionProcessExample example);
}