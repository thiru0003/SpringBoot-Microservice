package com.firstmile.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstmile.springboot.model.HoneywelModel;

@Repository

public interface HoneywelDao extends JpaRepository<HoneywelModel, Integer> {

}
