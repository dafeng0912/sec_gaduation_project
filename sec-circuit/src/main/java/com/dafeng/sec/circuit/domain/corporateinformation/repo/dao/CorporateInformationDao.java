package com.dafeng.sec.circuit.domain.corporateinformation.repo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dafeng.sec.circuit.domain.corporateinformation.entity.CorporateInformation;
import com.dafeng.sec.circuit.domain.corporateinformation.entity.example.CorporateInformationExample;

public interface CorporateInformationDao {
    long countByExample(CorporateInformationExample example);

    int deleteByExample(CorporateInformationExample example);

    int insert(CorporateInformation record);

    int insertSelective(CorporateInformation record);

    List<CorporateInformation> selectByExample(CorporateInformationExample example);

    int updateByExampleSelective(@Param("record") CorporateInformation record, @Param("example") CorporateInformationExample example);

    int updateByExample(@Param("record") CorporateInformation record, @Param("example") CorporateInformationExample example);
}