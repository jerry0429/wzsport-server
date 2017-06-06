package com.wzsport.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.FitnessCheckDataMapper;
import com.wzsport.model.FitnessCheckData;
import com.wzsport.service.FitnessCheckDataService;
import com.wzsport.util.BmiUtil;

@Service
public class FitnessCheckDataServiceImpl implements FitnessCheckDataService {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Override
	public FitnessCheckData create(FitnessCheckData fitnessCheckData) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FitnessCheckDataMapper fitnessCheckDataMapper = sqlSession.getMapper(FitnessCheckDataMapper.class);
		//计算BMI
		if(fitnessCheckData.getBmi()==null){
			float bmi = BmiUtil.calculateBmi(fitnessCheckData.getWeight(), fitnessCheckData.getHeight());
			fitnessCheckData.setBmi(bmi);
		}
		fitnessCheckDataMapper.save(fitnessCheckData);
		return fitnessCheckData;
	}

	@Override
	public FitnessCheckData update(FitnessCheckData fitnessCheckData) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FitnessCheckDataMapper fitnessCheckDataMapper = sqlSession.getMapper(FitnessCheckDataMapper.class);
		float bmi = BmiUtil.calculateBmi(fitnessCheckData.getWeight(), fitnessCheckData.getHeight());
		fitnessCheckData.setBmi(bmi);
		fitnessCheckDataMapper.updateFitnessCheckDataById(fitnessCheckData);
		return fitnessCheckData;
	}

}
