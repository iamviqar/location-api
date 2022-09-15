package com.hqv.location.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqv.location.assembler.StateAssembler;
import com.hqv.location.entity.Country;
import com.hqv.location.entity.State;
import com.hqv.location.pojo.StateDto;
import com.hqv.location.repository.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;

	public StateDto saveState(StateDto stateDto) {
		State state = new State();
		state.setName(stateDto.getName());
		state.setCode(stateDto.getCode());
		Country country = new Country();
		country.setId(stateDto.getCountry().getId());
		state.setCountry(country);
		stateRepository.save(state);
		stateDto.setId(state.getId());
		return stateDto;
	}


	public List<State> getList() {
		return stateRepository.findAll();
	}

	public Optional<State> getStateById(long id) {
		return stateRepository.findById(id);
	}


	public StateDto updateState(StateDto stateDto, long id) {
		stateDto.setId(id);
		State state =StateAssembler.assembleState(stateDto);
		stateRepository.save(state);
		return stateDto;
		
	}




}
