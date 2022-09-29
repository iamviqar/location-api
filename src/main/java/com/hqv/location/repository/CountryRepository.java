package com.hqv.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.location.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
	
	Country findOneById(Long id);

}
