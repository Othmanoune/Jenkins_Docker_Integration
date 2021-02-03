package com.ensa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ensa.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
