package com.dafeng.sec.circuit.interfaces.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dafeng.sec.circuit.domain.schoolinformation.entity.SchoolInformation;
import com.dafeng.sec.circuit.response.volobj.CircuitResponse;

@RequestMapping("/school")
public interface SchoolInfoRemoteApi {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    CircuitResponse<SchoolInformation> getAll();
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    CircuitResponse<SchoolInformation> update(SchoolInformation school);
}
