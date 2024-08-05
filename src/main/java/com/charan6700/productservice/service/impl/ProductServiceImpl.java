package com.charan6700.productservice.service.impl;

import com.charan6700.productservice.dto.product.CreateProductDto;
import com.charan6700.productservice.model.Brand;
import com.charan6700.productservice.model.Product;
import com.charan6700.productservice.repository.ProductRepository;
import com.charan6700.productservice.service.BrandService;
import com.charan6700.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private BrandService brandService;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public Product createProduct(CreateProductDto createProductDto) {
        Brand brand = brandService.getBrandById(createProductDto.getBrandId()).get();
        Product product = new Product();
        product.setName(createProductDto.getName());
        product.setBrand(brand);
        product.setVariants(createProductDto.getVariants());
        product.setMainDetails(createProductDto.getMainDetails());
        product.setAdditionalDetails(createProductDto.getAdditionalDetails());
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
