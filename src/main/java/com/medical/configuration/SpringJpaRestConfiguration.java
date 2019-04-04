package com.medical.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.medical.entity.user.Doctor;
import com.medical.entity.user.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.converter.HttpMessageConverter;

import java.util.List;

public class SpringJpaRestConfiguration {
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return new RepositoryRestConfigurer() {
            @Override
            public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
                config.exposeIdsFor(User.class, Doctor.class);
            }

            @Override
            public void configureJacksonObjectMapper(ObjectMapper objectMapper) {
                objectMapper = new ObjectMapper();
            }

            @Override
            public void configureHttpMessageConverters(List<HttpMessageConverter<?>> messageConverters) {

            }
        };
    }
}
