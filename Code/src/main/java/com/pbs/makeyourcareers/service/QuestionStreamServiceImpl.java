package com.pbs.makeyourcareers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.makeyourcareers.jpa.model.QuestionStream;
import com.pbs.makeyourcareers.jpa.repository.QuestionStreamRepository;

@Service
public class QuestionStreamServiceImpl implements QuestionStreamService{

	@Autowired
	QuestionStreamRepository questionStreamRepository;
	
	@Override
	public List<QuestionStream> findAllQuestionStream() {
		return (List<QuestionStream>) questionStreamRepository.findAll();
	}

	@Override
	public void save(QuestionStream questionStream) {
		questionStreamRepository.save(questionStream);
	}

	@Override
	public List<QuestionStream> findByQuestionType(Long id) {
		return (List<QuestionStream>) questionStreamRepository.findByQuestionType(id);
	}

}
