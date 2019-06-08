package com.dafeng.sec.circuit.domain.admissionprocess.service;

import java.util.List;

import com.dafeng.sec.circuit.domain.admissionprocess.entity.AdmissionProcess;

public interface AdmissionProcessService {

	List<AdmissionProcess> get();

	int insert(AdmissionProcess ap);

	int delete(int id);

	int update(AdmissionProcess ap);

}
