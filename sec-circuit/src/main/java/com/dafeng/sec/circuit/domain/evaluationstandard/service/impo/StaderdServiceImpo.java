package com.dafeng.sec.circuit.domain.evaluationstandard.service.impo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafeng.sec.circuit.domain.evaluationstandard.entity.EvaluationStandard;
import com.dafeng.sec.circuit.domain.evaluationstandard.entity.example.EvaluationStandardExample;
import com.dafeng.sec.circuit.domain.evaluationstandard.repo.dao.EvaluationStandardDao;
import com.dafeng.sec.circuit.domain.evaluationstandard.service.StaderdService;

@Service
public class StaderdServiceImpo implements StaderdService{
	
	@Autowired
	private EvaluationStandardDao dao;
	
	private EvaluationStandardExample example;

	@Override
	public List<EvaluationStandard> get() {
		example = new EvaluationStandardExample();
		return dao.selectByExample(example);
	}

	@Override
	public int insert(EvaluationStandard valuationStandard) {
		dao.insertSelective(valuationStandard);
		return valuationStandard.getId();
	}

	@Override
	public int updata(EvaluationStandard evaluationStandard) {
		example = new EvaluationStandardExample();
		example.createCriteria().andIdEqualTo(evaluationStandard.getId());
		return dao.updateByExample(evaluationStandard, example);
	}

	@Override
	public int delete(int id) {
		example = new EvaluationStandardExample();
		example.createCriteria().andIdEqualTo(id);
		return dao.deleteByExample(example);
	}

}
