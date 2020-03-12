package com.pbs.makeyourcareers.service;

import java.util.List;

import com.pbs.makeyourcareers.jpa.model.Country;

public interface CountryService {
	public List<Country> findAllCountry();
	public void save(Country country);
}
