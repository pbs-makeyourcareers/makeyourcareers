package com.pbs.makeyourcareers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.makeyourcareers.jpa.model.Skills;
import com.pbs.makeyourcareers.jpa.repository.SkillsRepository;

@Service
public class SkillsServiceImpl implements SkillsService{

	@Autowired
	SkillsRepository skillsRepository;
	
	@Override
	public List<Skills> findAllSkills() {
		return (List<Skills>) skillsRepository.findAll();
	}

	@Override
	public void save(Skills skills) {
		skillsRepository.save(skills);
	}

	@Override
	public List<Skills> findByQuestionStream(Long id) {
		return (List<Skills>) skillsRepository.findByQuestionStream(id);
	}

}
