package com.charan6700.productservice.model;

import lombok.Data;

import java.util.List;

@Data
public class Attribute {

    private String name;
    private String type;
    private Boolean isImage;
    private List<String> values;
}