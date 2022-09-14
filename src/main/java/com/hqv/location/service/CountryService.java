package com.hqv.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqv.location.assembler.CountryAssembler;
import com.hqv.location.entity.Country;
import com.hqv.location.pojo.CountryDto;
import com.hqv.location.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private CountryAssembler countryAssembler;

	public CountryDto saveCountry(CountryDto countryDto) {
		Country country = countryAssembler.assembleCountry(countryDto);
		countryRepository.save(country);
		countryDto.setId(country.getId());
		return countryDto;
	}

	public List<Country> getList() {
		return countryRepository.findAll();
	}

	public Optional<Country> getCountryById(long id) {
		return countryRepository.findById(id);
	}

	public CountryDto updateCountry(CountryDto countryDto, long id) {
		countryDto.setId(id);
		Country country = countryAssembler.assembleCountry(countryDto);
		countryRepository.save(country);
		return countryDto;
	}

}
