package com.dafeng.sec.circuit.domain.corporateinformation.service.impo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafeng.sec.circuit.domain.corporateinformation.entity.CorporateInformation;
import com.dafeng.sec.circuit.domain.corporateinformation.entity.example.CorporateInformationExample;
import com.dafeng.sec.circuit.domain.corporateinformation.repo.dao.CorporateInformationDao;
import com.dafeng.sec.circuit.domain.corporateinformation.service.CorporateInformationService;

@Service
public class CorporateInformationServiceImpo implements CorporateInformationService {
	
	@Autowired
	private CorporateInformationDao cifd;
	
	private CorporateInformationExample example;
	
	@Override
	public List<CorporateInformation> get() {
		example = new CorporateInformationExample();
		return cifd.selectByExample(example);
	}

	@Override
	public int update(CorporateInformation info) {
		example = new CorporateInformationExample();
		return cifd.updateByExample(info, example);
	}

}
