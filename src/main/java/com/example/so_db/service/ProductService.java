package com.example.so_db.service;

import com.example.so_db.entity.Product;
import com.example.so_db.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Создание продукта

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Получение продуктов


    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

    // Получение продукта

    public Product getOne(Long id) {
        Product product = productRepository.findById(id).get();
        return product;
    }

    // Обновление продукта

    public Product update(Long id, Product product) {
        product.setId(id);
        return productRepository.save(product);
    }

    // Удаление продукта

    public Long delete(Long id) {
        productRepository.deleteById(id);
        return id;
    }

    // Поисковые запросы

    public List<Product> getProductByProductName(String productName) {
        return productRepository.findProductByProductNameContaining(productName);
    }


}