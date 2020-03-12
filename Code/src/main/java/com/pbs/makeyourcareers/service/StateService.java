package com.pbs.makeyourcareers.service;

import java.util.List;

import com.pbs.makeyourcareers.jpa.model.State;

public interface StateService {
	public List<State> findAllState();
	public void save(State state);
}
