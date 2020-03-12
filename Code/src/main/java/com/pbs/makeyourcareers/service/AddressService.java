package com.pbs.makeyourcareers.service;

import java.util.List;

import com.pbs.makeyourcareers.jpa.model.Address;

public interface AddressService {
	public List<Address> findAllAddress();
	//public List<Skills> findByQuestionStream(Long id);
	public void save(Address address);
}
