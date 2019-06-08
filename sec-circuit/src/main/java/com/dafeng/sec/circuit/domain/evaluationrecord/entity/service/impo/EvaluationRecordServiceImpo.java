package com.dafeng.sec.circuit.domain.evaluationrecord.entity.service.impo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.dafeng.sec.circuit.domain.evaluationrecord.entity.EvaluationRecord;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO.EvaluationRecordUserBo;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.BO.RecordCount;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.example.EvaluationRecordExample;
import com.dafeng.sec.circuit.domain.evaluationrecord.entity.service.EvaluationRecordService;
import com.dafeng.sec.circuit.domain.evaluationrecord.repo.dao.EvaluationRecordDao;

@Service
public class EvaluationRecordServiceImpo implements EvaluationRecordService {
	
	@Autowired
	private EvaluationRecordDao dao;
	
	private EvaluationRecordExample example;

	@Override
	public List<RecordCount> get() {
		example = new EvaluationRecordExample();
		List<RecordCount> list = new ArrayList<RecordCount>();
		List<EvaluationRecord> selectByExample = dao.selectByExample(example);
//		定义四个对象
		RecordCount bujige = new RecordCount();
		bujige.setName("不合格");
		RecordCount mianqiang = new RecordCount();
		mianqiang.setName("基本合格");
		RecordCount hege = new RecordCount();
		hege.setName("合格");
		RecordCount youxiu = new RecordCount();
		youxiu.setName("优良");
		int bujigecount = 0;
		int mianqiangcount = 0;
		int hegecount = 0;
		int youxiucount = 0;
		for (EvaluationRecord record : selectByExample) {
			Integer count = record.getCount();
			System.out.println(count);
//			不及格
			if (count<60) {
				bujigecount++;
			}else if (count>=60&&count<70) {
				mianqiangcount++;
			}else if (count>=70&&count<80) {
				hegecount++;
			}else if (count>=80&&count<=100) {
				youxiucount++;
			}
		}
		bujige.setValue(bujigecount);
		hege.setValue(hegecount);
		mianqiang.setValue(mianqiangcount);
		youxiu.setValue(youxiucount);
		list.add(bujige);
		list.add(mianqiang);
		list.add(hege);
		list.add(youxiu);
		return list;
	}

	@Override
	public int insert(EvaluationRecord er) {
		System.out.println(er);
		return dao.insertSelective(er);
	}

	@Override
	public int delete(int id) {
		example = new EvaluationRecordExample();
		example.createCriteria().andIdEqualTo(id);
		return dao.deleteByExample(example);
	}

	@Override
	public int update(EvaluationRecord er) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EvaluationRecordUserBo> getViewUserRecord() {
		return dao.selectRecordUser();
	}

}
