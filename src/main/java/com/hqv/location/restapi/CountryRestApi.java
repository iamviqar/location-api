package com.hqv.location.restapi;

import java.util.List;
import java.util.Optional;

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
	public CountryDto saveCountry(@RequestBody CountryDto countryDto) {
		countryService.saveCountry(countryDto);
		return countryDto;
	}

	@PutMapping("/country/update/{id}")
	public CountryDto updateCountry(

			@RequestBody CountryDto countryDto, @PathVariable("id") long id) {
		countryService.updateCountry(countryDto, id);
		return countryDto;

	}

	
	 
	 @GetMapping("/country/list") 
	 public List<Country> getList(){
			return this.countryService.getList();
		}
	 
	 @GetMapping("/country/{id}")
		public Optional<Country> getCounById(
				@PathVariable("id") long id){
			return this.countryService.getCounById(id);
		}
	 
	
}
