package com.dafeng.sec.circuit.domain.corporateinformation.service;

import java.util.List;

import com.dafeng.sec.circuit.domain.corporateinformation.entity.CorporateInformation;

public interface CorporateInformationService {

	List<CorporateInformation> get();

	int update(CorporateInformation info);

}
