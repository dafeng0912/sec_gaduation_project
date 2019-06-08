package com.dafeng.sec.circuit.interfaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.dafeng.sec.circuit.domain.schoolinformation.entity.SchoolInformation;
import com.dafeng.sec.circuit.domain.schoolinformation.service.SchoolInfoService;
import com.dafeng.sec.circuit.interfaces.controller.api.SchoolInfoRemoteApi;
import com.dafeng.sec.circuit.response.volobj.CircuitResponse;

@Controller
public class SchoolInfoController implements SchoolInfoRemoteApi{
	
	@Autowired
	private SchoolInfoService schoolInfoService;
	

	@Override
	public CircuitResponse<SchoolInformation> getAll() {
		return new CircuitResponse<SchoolInformation>(schoolInfoService.get());
	}

	@Override
	public CircuitResponse<SchoolInformation> update(@RequestBody SchoolInformation school) {
		System.out.println(school.toString());
		return new CircuitResponse<SchoolInformation>(schoolInfoService.update(school));
	}

}
