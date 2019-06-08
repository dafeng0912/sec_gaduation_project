package com.dafeng.sec.circuit.domain.evaluationstandard.service;

import java.util.List;

import com.dafeng.sec.circuit.domain.evaluationstandard.entity.EvaluationStandard;

public interface StaderdService {
	
	List<EvaluationStandard> get();
	
	int insert(EvaluationStandard valuationStandard);
	
	int updata(EvaluationStandard evaluationStandard);
	
	int delete(int id);
	
}
