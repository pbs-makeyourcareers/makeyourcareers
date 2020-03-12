package com.pbs.makeyourcareers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.makeyourcareers.jpa.model.State;
import com.pbs.makeyourcareers.jpa.repository.StateRepository;

@Service
public class StateServiceImpl implements StateService{

	@Autowired
	StateRepository stateRepository;
	
	@Override
	public List<State> findAllState() {
		return (List<State>) stateRepository.findAll();
	}

	@Override
	public void save(State state) {
		stateRepository.save(state);
	}


}
