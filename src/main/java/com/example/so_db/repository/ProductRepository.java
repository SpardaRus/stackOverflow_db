package com.example.so_db.repository;

import com.example.so_db.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findByProductName(String productName);

    List<Product> findProductByProductNameContaining(String productProductName);


}
