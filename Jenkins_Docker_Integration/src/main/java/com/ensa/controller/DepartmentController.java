package com.ensa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.entities.Department;
import com.ensa.services.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@CrossOrigin(origins = "http://localhost:8088")
	@GetMapping("/")
	private List<Department> getDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/{departmentId}")
	private Optional<Department> getDepartment(@PathVariable Long departmentId){
		return departmentService.getDepartmentById(departmentId);
	}
	
	@PostMapping("/department/new")
	private Department saveDepartment(@RequestBody(required = true)  Department department){
		return departmentService.saveDepartment(department);
	}

}
