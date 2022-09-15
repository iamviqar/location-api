package com.hqv.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqv.location.entity.District;
import com.hqv.location.pojo.DistrictDto;
import com.hqv.location.repository.DistrictRepository;

@Service

public class DistrictSrevice {

	@Autowired
	private DistrictRepository districtRepository;

	public DistrictDto saveDistrict(DistrictDto districtDto) {
		District district = new District();
		district.setName(districtDto.getName());
		district.setCode(districtDto.getCode());
		districtRepository.save(district);
		districtDto.setId(district.getId());
		return districtDto;
	}

	public List<District> getList() {
		return districtRepository.findAll();
	}

	public Optional<District> getCounById(long id) {
		return districtRepository.findById(id);
	}

	public void updateDistrict(DistrictDto districtDto, long id) {

	}

}
