package com.dafeng.sec.circuit.domain.schoolinformation.service;

import java.util.List;

import com.dafeng.sec.circuit.domain.schoolinformation.entity.SchoolInformation;

public interface SchoolInfoService {
	
	List<SchoolInformation> get();
	
	int update(SchoolInformation school);
}
