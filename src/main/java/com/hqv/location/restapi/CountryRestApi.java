package com.hqv.location.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqv.location.entity.Country;
import com.hqv.location.pojo.CountryDto;
import com.hqv.location.service.CountryService;

@RestController
public class CountryRestApi {
	
	@Autowired
	CountryService countryService;
	
	@PostMapping("/country")
	public CountryDto saveCountry(
			@RequestBody CountryDto countryDto)
	{
		System.out.println(countryDto);
		countryService.saveCountry(countryDto);
		return countryDto;
	}
	
	
/*
 * @PutMapping("/country/{id") }
 */

}
