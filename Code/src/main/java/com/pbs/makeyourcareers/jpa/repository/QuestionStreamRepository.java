package com.pbs.makeyourcareers.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pbs.makeyourcareers.jpa.model.QuestionStream;

@Repository
public interface QuestionStreamRepository extends JpaRepository<QuestionStream, Long>{
	
	@Query("SELECT p FROM QuestionStream p WHERE p.questionType.id =:id")
	public List<QuestionStream> findByQuestionType(@Param("id") Long id);
}
