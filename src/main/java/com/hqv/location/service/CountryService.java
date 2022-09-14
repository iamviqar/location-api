package com.hqv.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqv.location.entity.Country;
import com.hqv.location.pojo.CountryDto;
import com.hqv.location.repository.CountryRepository;

@Service
public class CountryService {
	
	
	@Autowired
	private CountryRepository countryRepository;
	
	
	
	public CountryDto saveCountry(CountryDto countryDto) {
		Country country = new Country();
		country.setName(countryDto.getName());
		country.setCode(countryDto.getCode());
		countryRepository.save(country);
		countryDto.setId(country.getId());
		return countryDto;
	}
}
