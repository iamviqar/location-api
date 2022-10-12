package com.hqv.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.location.entity.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {

}
