package com.charan6700.productservice.model;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class Variants {

    private Attribute attribute1;
    private Attribute attribute2;

    private Set<VariantCombination> combinations;
    private Map<String, List<String>> images;

}

