package com.pbs.makeyourcareers.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbs.makeyourcareers.jpa.model.QuestionType;

@Repository
public interface QuestionTypeRepository extends JpaRepository<QuestionType, Long>{

}
