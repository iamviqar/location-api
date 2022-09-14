package com.hqv.location.assembler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqv.location.entity.Area;
import com.hqv.location.entity.AreaAlias;
import com.hqv.location.pojo.AreaAliasDto;
import com.hqv.location.pojo.AreaDto;

@Service
public class AreaAssembler {
	
	@Autowired
	DistrictAssembler districtAssembler;
	

	public Area assembleArea(AreaDto areaDto) {
		Area area = new Area();
		area.setId(areaDto.getId());
		area.setName(areaDto.getName());
		area.setCode(areaDto.getCode());
		area.setDistrict(districtAssembler.assembleDistrict(areaDto.getDistrict()));
		return area;
	}
	
	public AreaAlias assembleAreaAlias(AreaAliasDto areaAliasDto) {
		AreaAlias areaAlias = new AreaAlias();
		areaAlias.setId(areaAliasDto.getId());
		areaAlias.setName(areaAliasDto.getName());
		areaAlias.setArea(assembleArea(areaAliasDto.getArea()));
		return areaAlias;
	}
	
	public List<AreaAlias> assembleAreaAliasList(AreaDto areaDto) {
		
		List<AreaAlias> areaAliasList = new ArrayList<AreaAlias>();
		for(AreaAliasDto areaAliasDto : areaDto.getAreaAliasList()) {
			AreaAlias areaAlias =  new AreaAlias();
			areaAlias.setId(areaAliasDto.getId());
			areaAlias.setName(areaAliasDto.getName());
			areaAlias.setArea(assembleArea(areaAliasDto.getArea()));
			areaAliasList.add(areaAlias);
		}
		return areaAliasList;
	}

}
