package com.pbs.makeyourcareers.service;

import java.util.List;


import com.pbs.makeyourcareers.jpa.model.QuestionType;

public interface QuestionTypeService {
	public List<QuestionType> findAllQuestionType();
	public void save(QuestionType questionType);
}
