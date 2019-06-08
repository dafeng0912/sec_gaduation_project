package com.dafeng.sec.circuit.interfaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dafeng.sec.circuit.domain.evaluationstandard.entity.EvaluationStandard;
import com.dafeng.sec.circuit.domain.evaluationstandard.service.StaderdService;
import com.dafeng.sec.circuit.interfaces.controller.api.EvaluationStaderdRemoteApi;
import com.dafeng.sec.circuit.response.volobj.CircuitResponse;

@RestController
public class EvaluationStaderdController implements EvaluationStaderdRemoteApi {
	@Autowired
	private StaderdService staderdservice;

	@Override
	public CircuitResponse<EvaluationStandard> getStaderd() {
		return new CircuitResponse<EvaluationStandard>(staderdservice.get());
	}

	@Override
	public CircuitResponse<EvaluationStandard> insert(@RequestBody EvaluationStandard es) {
		System.out.println(es.toString());
		return new CircuitResponse<EvaluationStandard>(staderdservice.insert(es));
	}

	@Override
	public CircuitResponse<EvaluationStandard> update(@RequestBody EvaluationStandard es) {
		System.out.println(es.toString());
		return new CircuitResponse<EvaluationStandard>(staderdservice.updata(es));
	}

	@Override
	public CircuitResponse<EvaluationStandard> delete(@RequestParam int id) {
		return new CircuitResponse<EvaluationStandard>(staderdservice.delete(id));
	}

	

}
