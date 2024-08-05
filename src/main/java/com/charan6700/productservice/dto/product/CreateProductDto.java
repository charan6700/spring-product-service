package com.charan6700.productservice.dto.product;

import com.charan6700.productservice.model.Brand;
import com.charan6700.productservice.model.Information;
import com.charan6700.productservice.model.Variants;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
public class CreateProductDto {

    @NotEmpty
    @Length(min = 10, max = 250)
    private String name;
    @NotEmpty
    private String brandId;
    @NotEmpty
    private Variants variants;
    private List<Information> mainDetails;
    private List<Information> additionalDetails;
}
