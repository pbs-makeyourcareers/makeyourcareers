package com.pbs.makeyourcareers.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbs.makeyourcareers.jpa.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
