package com.firstmile.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdpController {
	@Autowired
	private AdpDao dao;

	@GetMapping("/all")
	public List<adpModel> getAllEmployee() {
		return dao.findAll();

	}

	@PostMapping("/save")
	public void saveEmployee(  adpModel hony) {
		dao.save(hony);

	}

	@DeleteMapping("/delete/id")
	public void deleteEmployeeById(@PathVariable("id") Integer id) {
		
			dao.deleteById(id);
			}

}
