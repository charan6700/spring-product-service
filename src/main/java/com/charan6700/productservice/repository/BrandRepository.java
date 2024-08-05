package com.charan6700.productservice.repository;

import com.charan6700.productservice.model.Brand;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BrandRepository extends MongoRepository<Brand, String> {
}
