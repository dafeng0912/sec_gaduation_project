package com.dafeng.sec.circuit.interfaces.controller.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dafeng.sec.circuit.domain.admissionprocess.entity.AdmissionProcess;
import com.dafeng.sec.circuit.response.volobj.CircuitResponse;

/**
 * 	校企合作时间轴
 * 		抽离requestmapping提供接口
 * @author 大风
 *
 */
@RequestMapping("/admission")
public  interface AdmissionProcessRemoteApi {
	
	/**
	 * 	获取全部时间轴节点
	 * @return
	 */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    CircuitResponse<AdmissionProcess> getAdmission();
    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    CircuitResponse<AdmissionProcess> insert(@RequestBody AdmissionProcess ap);
    
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    CircuitResponse<AdmissionProcess> delete(@RequestParam int id);
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    CircuitResponse<AdmissionProcess> update(@RequestBody AdmissionProcess ap);
}
