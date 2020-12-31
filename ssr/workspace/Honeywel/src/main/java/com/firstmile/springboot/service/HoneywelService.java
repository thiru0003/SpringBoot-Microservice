package com.firstmile.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstmile.springboot.dao.HoneywelDao;
import com.firstmile.springboot.model.HoneywelModel;

@Service
public class HoneywelService {
	@Autowired
	private final HoneywelDao dao;

	public HoneywelService(HoneywelDao dao) {
		this.dao = dao;
	}

	public Optional<HoneywelModel> getEmployeeById(Integer id) {
		Optional<HoneywelModel> employee = dao.findById(id);
		return employee;
	}

	public List<HoneywelModel> getAllEmployees() {
		List<HoneywelModel> Employees = dao.findAll();
		return Employees;
	}

	public String saveEmployee(HoneywelModel model) {
		dao.save(model);
		return "empoyee is saved";

	}

	public String deleteEmployeeByID(Integer id) {
		dao.deleteById(id);
		return "employee is deleted";
	}

	public void updateEmployeeById(HoneywelModel model) {
		
		Integer id2 = model.getHid();
		Optional<HoneywelModel> newEmployee = dao.findById(id2);

		if (newEmployee.isPresent()) {
		
			
			
		}
	}

}
