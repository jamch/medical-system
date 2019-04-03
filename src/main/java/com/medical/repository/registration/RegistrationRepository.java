package com.medical.repository.registration;

import com.medical.entity.registration.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "registrations")
public interface RegistrationRepository extends JpaRepository<Registration, Long>, QuerydslPredicateExecutor<Registration> {
}
