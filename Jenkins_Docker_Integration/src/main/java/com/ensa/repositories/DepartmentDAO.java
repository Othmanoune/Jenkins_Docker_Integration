package com.ensa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensa.entities.Department;

@Repository
public interface DepartmentDAO extends JpaRepository<Department, Long>{
	
	

}
