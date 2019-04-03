package com.medical.repository.user;

import com.medical.entity.user.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "patients")
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
