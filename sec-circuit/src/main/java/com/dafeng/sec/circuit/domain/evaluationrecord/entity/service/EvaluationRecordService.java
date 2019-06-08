package com.dafeng.sec.circuit.domain.evaluationrecord.entity.service;

import java.util.List;

import com.dafeng.sec.circuit.domain.evaluationrecord.entity.EvaluationRecord;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO.EvaluationRecordUserBo;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO.RecordCount;

public interface EvaluationRecordService {

	/**
	 * 	返回key：value键值对表示echarts图表
	 * @return
	 */
	List<RecordCount> get();

	int insert(EvaluationRecord er);

	int delete(int id);

	int update(EvaluationRecord er);
	
	List<EvaluationRecordUserBo> getViewUserRecord();
}
