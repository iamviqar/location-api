package com.hqv.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqv.location.assembler.AreaAssembler;
import com.hqv.location.entity.Area;
import com.hqv.location.entity.AreaAlias;
import com.hqv.location.pojo.AreaAliasDto;
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
	private AreaAssembler areaAssembler;

	public AreaDto saveArea(AreaDto areaDto) {
		Area area = areaRepository.save(areaAssembler.assembleArea(areaDto));
		for (AreaAliasDto areaAliasDto : areaDto.getAreaAliasList()) {
			AreaAlias areaAlias = areaAssembler.assembleAreaAlias(areaAliasDto);
			areaAlias.setArea(area);
			areaAliasRepository.save(areaAlias);
		}
		return areaDto;
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
