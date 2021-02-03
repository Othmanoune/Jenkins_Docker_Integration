package com.ensa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.entities.Department;
import com.ensa.entities.Salle;
import com.ensa.repositories.SalleDAO;

@Service
public class SalleService {
	
	@Autowired
	private SalleDAO salleRepository;
	
	public Salle saveSalle(Salle salle)
	{
		return salleRepository.save(salle);
	}
	
	public Optional<Salle> getSalleById(Long id)
	{
		return salleRepository.findById(id);
	}
	
	public List<Salle> getSalleByDepartment(Department dep)
	{
		return salleRepository.findByDepartment(dep);
	}
	
	public List<Salle> getAllSalles()
	{
		return salleRepository.findAll();
	}
	public Long countsalleD(Long id)
	{
		
		return salleRepository.countsalleD(id);
	}

}
