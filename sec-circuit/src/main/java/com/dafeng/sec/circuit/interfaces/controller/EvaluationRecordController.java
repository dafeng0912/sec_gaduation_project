package com.dafeng.sec.circuit.interfaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.dafeng.sec.circuit.domain.evaluationrecord.entity.EvaluationRecord;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO.EvaluationRecordUserBo;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO.RecordCount;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.service.EvaluationRecordService;
import com.dafeng.sec.circuit.interfaces.controller.api.EvaluationRecordRemoteApi;
import com.dafeng.sec.circuit.response.volobj.CircuitResponse;

@Controller
public class EvaluationRecordController implements EvaluationRecordRemoteApi {

	@Autowired
	private EvaluationRecordService erservice;
	
	@Override
	public CircuitResponse<RecordCount> getAll() {
		// TODO Auto-generated method stub
		return new CircuitResponse<RecordCount>(erservice.get());
	}

	@Override
	public CircuitResponse<EvaluationRecord> update(@RequestBody EvaluationRecord record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CircuitResponse<EvaluationRecord> insert(@RequestBody EvaluationRecord record) {
		System.out.println(record.toString());
		return new CircuitResponse<EvaluationRecord>(erservice.insert(record));
	}

	@Override
	public CircuitResponse<EvaluationRecord> delete(int id) {
		return new CircuitResponse<EvaluationRecord>(erservice.delete(id));
	}

	@Override
	public CircuitResponse<EvaluationRecordUserBo> getView() {
		return new CircuitResponse<EvaluationRecordUserBo>(erservice.getViewUserRecord());
	}

}
