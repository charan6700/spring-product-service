package com.charan6700.productservice.service;

import com.charan6700.productservice.dto.product.CreateProductDto;
import com.charan6700.productservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {

    public List<Product> getAllProducts();

    public Optional<Product> getProductById(String id);

    public Product createProduct(CreateProductDto createProductDto);

    public void deleteProduct(String id);
}

