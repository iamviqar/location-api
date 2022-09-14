package com.hqv.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqv.location.assembler.CountryAssembler;
import com.hqv.location.pojo.AreaDto;
import com.hqv.location.pojo.CountryDto;
import com.hqv.location.repository.AreaAliasRepository;
import com.hqv.location.repository.AreaRepository;

@Service
public class AreaService {

	@Autowired
	private AreaRepository areaRepository;
	
	@Autowired
	private AreaAliasRepository areaAliasRepository;
	
	@Autowired
	private CountryAssembler countryAssembler;

	public CountryDto saveArea(AreaDto areaDto) {
		
		return null;
	}

	/*
	 * public List<Country> getList() { return countryRepository.findAll(); }
	 * 
	 * public Optional<Country> getCountryById(long id) { return
	 * countryRepository.findById(id); }
	 * 
	 * public CountryDto updateCountry(CountryDto countryDto, long id) {
	 * countryDto.setId(id); Country country =
	 * countryAssembler.assembleCountry(countryDto);
	 * countryRepository.save(country); return countryDto; }
	 */

}
