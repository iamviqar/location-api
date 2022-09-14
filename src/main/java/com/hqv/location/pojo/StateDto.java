package com.hqv.location.pojo;

import lombok.Data;

@Data

public class StateDto {
	private Long id;
	
	private String name;
	
	private String code;
	
	private CountryDto country;
}
