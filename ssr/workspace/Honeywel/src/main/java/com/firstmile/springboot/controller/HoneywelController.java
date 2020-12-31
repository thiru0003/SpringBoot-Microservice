package com.firstmile.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstmile.springboot.model.HoneywelModel;
import com.firstmile.springboot.service.HoneywelService;
import com.firstmile.springboot.util.DBConfig;

@RestController
public class HoneywelController {
	@Autowired
	private HoneywelService service;
	@Autowired
	private DBConfig config;

	@GetMapping("/all")
	public List<HoneywelModel> getAllEmployees() {
		List<HoneywelModel> allEmployees = service.getAllEmployees();
		return allEmployees;
	}

	@GetMapping("/get/{id}")
	public Optional<HoneywelModel> getEmployeeById(@PathVariable ("id") Integer id) {
		Optional<HoneywelModel> employeeById = service.getEmployeeById(id);
		return employeeById;
	}

	@GetMapping("/save")
	public DBConfig saveEmployee() {
		return config;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployeeById(@PathVariable("id") Integer id) {
		service.deleteEmployeeByID(id);
		return "deleted";
	}

	@PutMapping("/update")
	public String updateEmployeeById(HoneywelModel model) {
		service.updateEmployeeById(model);
		return "updated successfuly";
	}
}
