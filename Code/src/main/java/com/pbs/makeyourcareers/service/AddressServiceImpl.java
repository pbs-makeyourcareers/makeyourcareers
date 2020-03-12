package com.pbs.makeyourcareers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.makeyourcareers.jpa.model.Address;
import com.pbs.makeyourcareers.jpa.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressRepository addressRepository;
	
	@Override
	public List<Address> findAllAddress() {
		return (List<Address>) addressRepository.findAll();
	}

	@Override
	public void save(Address skills) {
		addressRepository.save(skills);
	}

	/*
	 * @Override public List<Skills> findByQuestionStream(Long id) { return
	 * (List<Skills>) skillsRepository.findByQuestionStream(id); }
	 */

}
