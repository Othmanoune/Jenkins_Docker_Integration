package com.ensa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.entities.Department;
import com.ensa.repositories.DepartmentDAO;

@Service
public class DepartmentService {
	
	@Autowired(required=true)
		private DepartmentDAO departmentRepository;
		
		public Department saveDepartment(Department department)
		{
			return departmentRepository.save(department);
		}
		
		public Optional<Department> getDepartmentById(Long id)
		{
			return departmentRepository.findById(id);
		}
		
		public List<Department> getAllDepartments()
		{
			return departmentRepository.findAll();
		}
		
		
}
