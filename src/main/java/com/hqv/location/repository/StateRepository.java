package com.hqv.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.location.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
