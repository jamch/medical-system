package com.medical.enums;

import lombok.Getter;

@Getter
public enum UserTypeEnum {

    PATIENT(1),

    DOCTOR(2);

    private int type;

    UserTypeEnum(int type) {
        this.type = type;
    }
}
