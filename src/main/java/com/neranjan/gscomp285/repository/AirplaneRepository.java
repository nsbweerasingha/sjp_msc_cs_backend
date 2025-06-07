package com.neranjan.gscomp285.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neranjan.gscomp285.entity.Airplanes;

@Repository
public interface AirplaneRepository extends JpaRepository<Airplanes, Long>{

}
