package com.pbs.makeyourcareers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbs.makeyourcareers.jpa.model.City;
import com.pbs.makeyourcareers.jpa.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	CityRepository cityRepository;
	
	@Override
	public List<City> findAllCity() {
		return (List<City>) cityRepository.findAll();
	}

	@Override
	public void save(City city) {
		cityRepository.save(city);
	}


}
