package com.ensa.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ensa.entities.Department;
import com.ensa.entities.Salle;

@Repository
public interface SalleDAO extends JpaRepository<Salle, Long> {
	
	List<Salle> findByDepartment(Department department);
	
	/*@Query("from Salle s where s.dapartement.id = (:idDep)")
	List<Salle> findByDepartment(@Param("idDep") Long idDep);*/

	
	@Query("SELECT COUNT(s) FROM Salle s WHERE s.department.id=?1")
    long countsalleD(Long a);

	
	 
	
	 

}
