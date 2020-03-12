package com.pbs.makeyourcareers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.makeyourcareers.jpa.model.Register;
import com.pbs.makeyourcareers.jpa.repository.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterRepository registerRepository;
	
	@Override
	public List<Register> findAllRegister() {
		return (List<Register>) registerRepository.findAll();
	}

	@Override
	public void save(Register register) {
		registerRepository.save(register);
	}

	/*
	 * @Override public List<Skills> findByQuestionStream(Long id) { return
	 * (List<Skills>) skillsRepository.findByQuestionStream(id); }
	 */

}
