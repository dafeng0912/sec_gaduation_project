package com.dafeng.sec.circuit.domain.schoolinformation.service.impo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafeng.sec.circuit.domain.schoolinformation.entity.SchoolInformation;
import com.dafeng.sec.circuit.domain.schoolinformation.entity.example.SchoolInformationExample;
import com.dafeng.sec.circuit.domain.schoolinformation.repo.dao.SchoolInformationDao;
import com.dafeng.sec.circuit.domain.schoolinformation.service.SchoolInfoService;

@Service
public class SchoolInfoImpo implements SchoolInfoService {
	
	@Autowired
	private SchoolInformationDao sidao;
	
	private SchoolInformationExample example;

	@Override
	public List<SchoolInformation> get() {
		example = new SchoolInformationExample();
		return sidao.selectByExample(example);
	}

	@Override
	public int update(SchoolInformation school) {
		example = new SchoolInformationExample();
		example.createCriteria().andIdEqualTo(school.getId());
		return sidao.updateByExample(school, example);
	}

}
