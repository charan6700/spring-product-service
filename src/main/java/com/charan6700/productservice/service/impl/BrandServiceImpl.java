package com.charan6700.productservice.service.impl;

import com.charan6700.productservice.dto.brand.CreateBrandRequestDto;
import com.charan6700.productservice.model.Brand;
import com.charan6700.productservice.repository.BrandRepository;
import com.charan6700.productservice.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Optional<Brand> getBrandById(String id) {
        return brandRepository.findById(id);
    }

    @Override
    public Brand createBrand(CreateBrandRequestDto brandRequest) {
        Brand brand = new Brand();
        brand.setName(brandRequest.getName());
        brand.setStoreUrl(brandRequest.getStoreUrl());
        return brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(String id) {
        brandRepository.deleteById(id);
    }
}

