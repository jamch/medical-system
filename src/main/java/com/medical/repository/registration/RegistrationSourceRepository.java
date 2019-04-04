package com.medical.repository.registration;

import com.medical.entity.registration.RegistrationSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "registration_sources")
public interface RegistrationSourceRepository extends JpaRepository<RegistrationSource, Long>, QuerydslPredicateExecutor<RegistrationSource> {
}
