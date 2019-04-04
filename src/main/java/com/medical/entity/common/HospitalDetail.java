package com.medical.entity.common;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "detail", types = Hospital.class)
public interface HospitalDetail {

    String getLogo();

    String getName();

    String getAddress();

    Dict getLevel();
}
