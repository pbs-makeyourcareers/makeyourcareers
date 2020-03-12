package com.pbs.makeyourcareers.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbs.makeyourcareers.jpa.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
