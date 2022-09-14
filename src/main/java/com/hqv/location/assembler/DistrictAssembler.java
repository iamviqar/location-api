package com.hqv.location.assembler;

import com.hqv.location.entity.District;
import com.hqv.location.pojo.DistrictDto;

public class DistrictAssembler {

	public District assembleDistrict(DistrictDto districtDto) {
		District district = new District();
		district.setId(districtDto.getId());
		district.setCode(districtDto.getCode());
		district.setName(districtDto.getName());
		return district;
	}
	
}
