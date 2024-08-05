package com.charan6700.productservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
@Data
public class Product {

    @Id
    private String id;
    private String name;
    @DBRef
    private Brand brand;
    private Variants variants;
    private List<Information> mainDetails;
    private List<Information> additionalDetails;
}
