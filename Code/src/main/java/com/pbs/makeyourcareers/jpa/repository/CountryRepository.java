package com.pbs.makeyourcareers.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbs.makeyourcareers.jpa.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
