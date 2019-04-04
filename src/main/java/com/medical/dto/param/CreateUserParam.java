package com.medical.dto.param;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CreateUserParam extends BaseParam {

    @NotBlank
    private String name;

    @Min(1)
    @Max(2)
    private Integer sex;

    @Min(1)
    @Max(2)
    private Integer userType;

    @NotBlank
    private String phone;

    @NotBlank
    private String verCode;
}
