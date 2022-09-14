package com.hqv.location.pojo;

import java.util.List;

import lombok.Data;

@Data
public class AreaDto {

	private Long id;

	private String name;

	private String code;
	
	private DistrictDto district;
	
	private List<AreaAliasDto> areaAliasList;

}
