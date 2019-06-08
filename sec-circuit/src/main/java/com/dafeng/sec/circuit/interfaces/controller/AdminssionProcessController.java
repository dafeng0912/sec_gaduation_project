package com.dafeng.sec.circuit.interfaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.dafeng.sec.circuit.domain.admissionprocess.entity.AdmissionProcess;
import com.dafeng.sec.circuit.domain.admissionprocess.service.AdmissionProcessService;
import com.dafeng.sec.circuit.interfaces.controller.api.AdmissionProcessRemoteApi;
import com.dafeng.sec.circuit.response.volobj.CircuitResponse;

@Controller
public class AdminssionProcessController implements AdmissionProcessRemoteApi {
	
	@Autowired
	private AdmissionProcessService apservice;

	@Override
	public CircuitResponse<AdmissionProcess> getAdmission() {
		return new CircuitResponse<AdmissionProcess>(apservice.get());
	}

	@Override
	public CircuitResponse<AdmissionProcess> insert(@RequestBody AdmissionProcess ap) {
		return new CircuitResponse<AdmissionProcess>(apservice.insert(ap));
	}

	@Override
	public CircuitResponse<AdmissionProcess> delete(@RequestParam int id) {
		return new CircuitResponse<AdmissionProcess>(apservice.delete(id));
	}

	@Override
	public CircuitResponse<AdmissionProcess> update(@RequestBody AdmissionProcess ap) {
		return new CircuitResponse<AdmissionProcess>(apservice.update(ap));
	}
	
}
