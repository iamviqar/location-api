package com.hqv.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.location.entity.District;
import com.hqv.location.pojo.DistrictDto;

@Repository

public interface DistrictRepository extends JpaRepository<District, Long>{

	void save(DistrictDto district);

}
