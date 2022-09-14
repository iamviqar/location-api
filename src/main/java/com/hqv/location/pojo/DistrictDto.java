package com.hqv.location.pojo;

import lombok.Data;

@Data
public class DistrictDto {
	
	private Long id;
	
	private String name;
	
	private String code;
	
	private StateDto state;
	
}
