package com.dafeng.sec.circuit.interfaces.controller.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dafeng.sec.circuit.domain.evaluationstandard.entity.EvaluationStandard;
import com.dafeng.sec.circuit.response.volobj.CircuitResponse;

@RequestMapping("/stadard")
public interface EvaluationStaderdRemoteApi {
	
	/**
	 * 	获得所有的评论标准
	 * @return
	 */
	 @RequestMapping(value = "/get", method = RequestMethod.GET)
	 @ResponseBody
	 CircuitResponse<EvaluationStandard> getStaderd();
	 
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	 @ResponseBody
	 CircuitResponse<EvaluationStandard> insert(@RequestBody EvaluationStandard es);
	 
	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 @ResponseBody
	 CircuitResponse<EvaluationStandard> update(@RequestBody EvaluationStandard es);
	 
	 @RequestMapping(value = "/delete", method = RequestMethod.GET)
	 @ResponseBody
	 CircuitResponse<EvaluationStandard> delete(@RequestParam int id);
}
