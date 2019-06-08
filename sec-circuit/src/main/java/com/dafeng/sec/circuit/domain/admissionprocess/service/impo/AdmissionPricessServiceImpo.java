package com.dafeng.sec.circuit.domain.admissionprocess.service.impo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dafeng.sec.circuit.domain.admissionprocess.entity.AdmissionProcess;
import com.dafeng.sec.circuit.domain.admissionprocess.entity.example.AdmissionProcessExample;
import com.dafeng.sec.circuit.domain.admissionprocess.repo.dao.AdmissionProcessDao;
import com.dafeng.sec.circuit.domain.admissionprocess.service.AdmissionProcessService;

@Service
public class AdmissionPricessServiceImpo implements AdmissionProcessService {

	@Autowired
	private AdmissionProcessDao admissionprocessdao;
	
	private AdmissionProcessExample example;
	
	@Override
	public List<AdmissionProcess> get() {
		example = new AdmissionProcessExample();
		example.setOrderByClause("'order'");
		return admissionprocessdao.selectByExample(example);
	}

	@Override
	public int insert(AdmissionProcess ap) {
		example = new AdmissionProcessExample();
//		获得自增的id值注入到顺序中
		ap.setOrder(ap.getId());
		return admissionprocessdao.insertSelective(ap);
	}

	@Override
	public int delete(int id) {
		example = new AdmissionProcessExample();
		example.createCriteria().andIdEqualTo(id);
		return admissionprocessdao.deleteByExample(example);
	}

	@Override
	public int update(AdmissionProcess ap) {
		example = new AdmissionProcessExample();
		System.out.println(ap.toString());
		example.createCriteria().andIdEqualTo(ap.getId());
		return admissionprocessdao.updateByExampleSelective(ap, example);
	}

}
