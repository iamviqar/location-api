package com.hqv.location.assembler;

import org.springframework.stereotype.Service;

import com.hqv.location.entity.Country;
import com.hqv.location.pojo.CountryDto;

@Service
public class CountryAssembler {

	public Country assembleCountry(CountryDto countryDto) {
		Country country = new Country();
		country.setId(countryDto.getId());
		country.setCode(countryDto.getCode());
		country.setName(countryDto.getName());
		return country;
	}

}
