package com.neranjan.gscomp285.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neranjan.gscomp285.entity.MstContactType;


@Repository
public interface MstContactTypeRepository extends JpaRepository<MstContactType, Long>{
	@Query(value ="SELECT * FROM mst_contact_type WHERE code = ?1", nativeQuery = true)
	public MstContactType findbycode(String code);
}
