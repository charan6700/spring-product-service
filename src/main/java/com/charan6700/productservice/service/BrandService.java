package com.charan6700.productservice.service;

import com.charan6700.productservice.dto.brand.CreateBrandRequestDto;
import com.charan6700.productservice.model.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandService {
    List<Brand> getAllBrands();
    Optional<Brand> getBrandById(String id);
    Brand createBrand(CreateBrandRequestDto createBrandRequest);
    void deleteBrand(String id);
}

