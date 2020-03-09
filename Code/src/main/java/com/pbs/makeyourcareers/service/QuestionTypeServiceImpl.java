package com.pbs.makeyourcareers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.makeyourcareers.jpa.model.QuestionType;
import com.pbs.makeyourcareers.jpa.repository.QuestionTypeRepository;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService{

	@Autowired
	QuestionTypeRepository questionTypeRepository;
	
	@Override
	public List<QuestionType> findAllQuestionType() {
		return (List<QuestionType>) questionTypeRepository.findAll();
	}

	@Override
	public void save(QuestionType questionType) {
		questionTypeRepository.save(questionType);
	}

}
