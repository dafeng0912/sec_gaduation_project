package com.dafeng.sec.circuit.interfaces.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.dafeng.sec.circuit.domain.corporateinformation.entity.CorporateInformation;
import com.dafeng.sec.circuit.domain.corporateinformation.service.CorporateInformationService;
import com.dafeng.sec.circuit.interfaces.controller.api.CorporateInfoRemoteApi;
import com.dafeng.sec.circuit.response.volobj.CircuitResponse;

@Controller
public class CorporateInfoControl implements CorporateInfoRemoteApi {
	
	@Autowired
	private CorporateInformationService corpoeateService;
	
	@Override
	public CircuitResponse<CorporateInformation> getAll() {
		List<CorporateInformation> list = corpoeateService.get();
		System.out.println(list.get(0));
		return new CircuitResponse<CorporateInformation>(corpoeateService.get());
	}

	@Override
	public CircuitResponse<CorporateInformation> update(@RequestBody CorporateInformation corporate) {
//		System.out.println(corporate.toString());
		return new CircuitResponse<CorporateInformation>(corpoeateService.update(corporate));
	}

}
