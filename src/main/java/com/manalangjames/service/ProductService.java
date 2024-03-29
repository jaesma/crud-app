package com.manalangjames.service;

import com.manalangjames.model.Product;
import com.manalangjames.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
