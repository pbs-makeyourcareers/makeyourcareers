package com.pbs.makeyourcareers.service;

import java.util.List;

import com.pbs.makeyourcareers.jpa.model.Skills;

public interface SkillsService {
	public List<Skills> findAllSkills();
	public List<Skills> findByQuestionStream(Long id);
	public void save(Skills skills);
}
