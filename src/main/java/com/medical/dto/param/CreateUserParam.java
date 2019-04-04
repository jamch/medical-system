package com.medical.dto.param;

import com.medical.enums.UserTypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateUserParam extends BaseParam {

    @NotNull
    private UserTypeEnum userType;

    @NotBlank
    private String phone;

    @NotBlank
    private String openId;
}
