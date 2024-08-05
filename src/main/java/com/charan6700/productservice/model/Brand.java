package com.charan6700.productservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "brands")
public class Brand {

    @Id
    private String id;
    private String name;
    private String storeUrl;
}
