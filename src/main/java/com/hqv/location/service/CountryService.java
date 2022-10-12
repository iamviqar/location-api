package com.hqv.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.hqv.location.assembler.CountryAssembler;
import com.hqv.location.entity.Country;
import com.hqv.location.exception.RecordNotFoundException;
import com.hqv.location.exception.UniqueRecordException;
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
		try {
			countryRepository.save(country);
		} catch (DataIntegrityViolationException e) {
			throw new UniqueRecordException("Duplicate Value Passed For Unique Key");
		}
		countryDto.setId(country.getId());
		return countryDto;
	}

	public List<Country> getList() {
		return countryRepository.findAll();
	}

	public Optional<Country> getCountryById(long id) {
		Country country = countryRepository.findOneById(id);
		if (country == null) {
			throw new RecordNotFoundException("Country not found for the id: " + id);
		}
		return countryRepository.findById(id);
	}

	public CountryDto updateCountry(CountryDto countryDto, long id) {
		countryDto.setId(id);
		Country country = countryAssembler.assembleCountry(countryDto);
		try {
			countryRepository.save(country);
		} catch (DataIntegrityViolationException e) {
			throw new UniqueRecordException("Duplicate Value Passed For Unique Key");
		}
		return countryDto;
	}

}
