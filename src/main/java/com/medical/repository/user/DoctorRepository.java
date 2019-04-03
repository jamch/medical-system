package com.medical.repository.user;

import com.medical.entity.user.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "doctors")
public interface DoctorRepository extends JpaRepository<Doctor, Long>, QuerydslPredicateExecutor<Doctor> {
}
