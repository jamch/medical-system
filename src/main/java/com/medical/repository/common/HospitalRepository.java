package com.medical.repository.common;

import com.medical.entity.common.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author 洪锦城【hongjc@3vjia.com】
 * @since 2019/4/3 9:42
 */
@RepositoryRestResource(path = "hospitals")
public interface HospitalRepository extends JpaRepository<Hospital, Long>, QuerydslPredicateExecutor<Hospital> {
}
