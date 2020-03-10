package com.pbs.makeyourcareers.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pbs.makeyourcareers.jpa.model.Skills;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long>{
	
	@Query("SELECT p FROM Skills p WHERE p.questionStream.id =:id")
	public List<Skills> findByQuestionStream(@Param("id") Long id);
}
