package com.dafeng.sec.circuit.domain.evaluationstandard.repo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dafeng.sec.circuit.domain.evaluationstandard.entity.EvaluationStandard;
import com.dafeng.sec.circuit.domain.evaluationstandard.entity.example.EvaluationStandardExample;

public interface EvaluationStandardDao {
	
    long countByExample(EvaluationStandardExample example);

    int deleteByExample(EvaluationStandardExample example);
//	insert会插入所有的信息，如果传入的对象某一属性为空，则插入空，如果数据库中设置了默认值，默认值就失效了。
    int insert(EvaluationStandard record);

//  insertSelective只会插入含有数据的属性，对于为空的属性，不予以处理
    int insertSelective(EvaluationStandard record);
    
//   通过特定限制条件查询信息，example用于生成一个Criteria对象来设置查询条件
    List<EvaluationStandard> selectByExample(EvaluationStandardExample example);

//	根据特定的限制条件进行更新除了text类型(数据库)的所有列。
    int updateByExampleSelective(@Param("record") EvaluationStandard record, @Param("example") EvaluationStandardExample example);

//  根据特定的限制条件更新所有设置了值的列。
    int updateByExample(@Param("record") EvaluationStandard record, @Param("example") EvaluationStandardExample example);
}