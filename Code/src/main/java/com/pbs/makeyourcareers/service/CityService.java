package com.pbs.makeyourcareers.service;

import java.util.List;

import com.pbs.makeyourcareers.jpa.model.City;

public interface CityService {
	public List<City> findAllCity();
	public void save(City city);
}
