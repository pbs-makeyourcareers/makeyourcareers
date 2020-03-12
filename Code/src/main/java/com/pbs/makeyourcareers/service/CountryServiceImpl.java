package com.pbs.makeyourcareers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.makeyourcareers.jpa.model.Country;
import com.pbs.makeyourcareers.jpa.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	CountryRepository countryRepository;
	
	@Override
	public List<Country> findAllCountry() {
		return (List<Country>) countryRepository.findAll();
	}

	@Override
	public void save(Country country) {
		countryRepository.save(country);
	}


}
