package com.pbs.makeyourcareers.service;

import java.util.List;

import com.pbs.makeyourcareers.jpa.model.QuestionStream;

public interface QuestionStreamService {
	public List<QuestionStream> findAllQuestionStream();
	public List<QuestionStream> findByQuestionType(Long id);
	public void save(QuestionStream questionStream);
}
