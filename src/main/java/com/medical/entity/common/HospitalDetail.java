package com.medical.entity.common;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "detail", types = Hospital.class)
public interface HospitalDetail {

    String getName();

    Dict getLevel();
}
