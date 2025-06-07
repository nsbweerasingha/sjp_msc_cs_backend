package com.neranjan.gscomp285.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neranjan.gscomp285.entity.Seats;

@Repository
public interface SeatRepository extends JpaRepository<Seats, Long>{

}
