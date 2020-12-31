package com.firstmile.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@JsonInclude(value = Include.NON_NULL)
@Table(name = "honeywell_tbl",schema ="bms")
public class HoneywelModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private  Integer hid;
	private  String name;
	private  Double salary;
	private  Double taxamount;
	private  Double  netamount;

}
