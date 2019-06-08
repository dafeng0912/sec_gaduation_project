package com.dafeng.sec.circuit.interfaces.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dafeng.sec.circuit.domain.corporateinformation.entity.CorporateInformation;
import com.dafeng.sec.circuit.response.volobj.CircuitResponse;

@RequestMapping("/corporate")
public interface CorporateInfoRemoteApi {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    CircuitResponse<CorporateInformation> getAll();
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    CircuitResponse<CorporateInformation> update(CorporateInformation corporate);
}
