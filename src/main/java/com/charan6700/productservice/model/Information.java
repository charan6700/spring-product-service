package com.charan6700.productservice.model;

import lombok.Data;

import java.util.List;

@Data
public class Information {

    private String title;
    private String informationType;
    private List<String> details;
}