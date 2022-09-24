package com.hqv.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hqv.location.entity.AreaAlias;

@Repository
public interface AreaAliasRepository extends JpaRepository<AreaAlias, Long> {

}
