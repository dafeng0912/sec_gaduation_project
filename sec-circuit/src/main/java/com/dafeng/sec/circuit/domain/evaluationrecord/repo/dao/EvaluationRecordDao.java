package com.dafeng.sec.circuit.domain.evaluationrecord.repo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dafeng.sec.circuit.domain.evaluationrecord.entity.EvaluationRecord;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO.EvaluationRecordUserBo;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.example.EvaluationRecordExample;

@Mapper
public interface EvaluationRecordDao {
	
	List<EvaluationRecordUserBo> selectRecordUser();
		
    long countByExample(EvaluationRecordExample example);

    int deleteByExample(EvaluationRecordExample example);

    int insert(EvaluationRecord record);

    int insertSelective(EvaluationRecord record);

    List<EvaluationRecord> selectByExample(EvaluationRecordExample example);

    int updateByExampleSelective(@Param("record") EvaluationRecord record, @Param("example") EvaluationRecordExample example);

    int updateByExample(@Param("record") EvaluationRecord record, @Param("example") EvaluationRecordExample example);
}