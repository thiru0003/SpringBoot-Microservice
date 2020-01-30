package com.firstmile.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdpDao extends JpaRepository<adpModel, Integer> {

}
