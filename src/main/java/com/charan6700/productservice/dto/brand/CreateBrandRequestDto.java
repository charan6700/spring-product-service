package com.charan6700.productservice.dto.brand;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class CreateBrandRequestDto {

    @NotEmpty
    @Length(min = 2)
    private String name;
    @NotEmpty
    @Length(min = 10)
    private String storeUrl;
}
