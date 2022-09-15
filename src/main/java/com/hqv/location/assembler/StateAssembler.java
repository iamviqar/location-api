package com.hqv.location.assembler;

import org.springframework.stereotype.Service;

import com.hqv.location.entity.State;
import com.hqv.location.pojo.StateDto;

@Service
public class StateAssembler {

	public static State assembleState(StateDto stateDto) {
		State state = new State();
		state.setId(stateDto.getId());
		state.setCode(stateDto.getCode());
		state.setName(stateDto.getName());
		return state;
	}

}
