package com.ensa.services;

import java.util.Optional;

import com.ensa.entities.Product;

public interface ProductService {

    Iterable<Product> listAllProducts();

    Optional<Product> getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}
