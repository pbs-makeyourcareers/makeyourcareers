package com.pbs.makeyourcareers.service;

import java.util.List;

import com.pbs.makeyourcareers.jpa.model.Register;

public interface RegisterService {
	public List<Register> findAllRegister();
	public void save(Register register);
}
