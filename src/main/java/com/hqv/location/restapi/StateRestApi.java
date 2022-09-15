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

import com.hqv.location.entity.State;
import com.hqv.location.pojo.StateDto;
import com.hqv.location.service.StateService;


@RestController
public class StateRestApi {
	
	@Autowired
	StateService stateService;
	
	@PostMapping("/state")
	public StateDto saveState(
			@RequestBody StateDto stateDto)
	{
		System.out.println(stateDto);
		stateService.saveState(stateDto);
		return stateDto;
	}
	@PutMapping("/state/update/{id}")
	public StateDto updateState(

		@RequestBody StateDto stateDto, @PathVariable("id") long id) {
		stateService.updateState(stateDto, id);
		return stateDto;

	}
	@GetMapping("/state")
	public List<State> getList(){
		return this.stateService.getList();
	}
	
	 @GetMapping("/state/{id}")
		public Optional<State> getCounById(@PathVariable("id") long id){
			return this.stateService.getStateById(id);
		}
	 
}
