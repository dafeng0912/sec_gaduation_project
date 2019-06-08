package com.dafeng.sec.circuit.interfaces.controller.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dafeng.sec.circuit.domain.evaluationrecord.entity.EvaluationRecord;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO.EvaluationRecordUserBo;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO.RecordCount;
import com.dafeng.sec.circuit.response.volobj.CircuitResponse;

@RequestMapping("/record")
public interface EvaluationRecordRemoteApi {
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    CircuitResponse<RecordCount> getAll();
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
    @ResponseBody
    CircuitResponse<EvaluationRecord> update(@RequestBody EvaluationRecord record);
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    CircuitResponse<EvaluationRecord> insert(@RequestBody EvaluationRecord record);
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    CircuitResponse<EvaluationRecord> delete(@RequestParam int id);
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    CircuitResponse<EvaluationRecordUserBo> getView();
}
