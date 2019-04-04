package com.medical.repository.common;

import com.medical.entity.common.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * @author 洪锦城【hongjc@3vjia.com】
 * @since 2019/4/3 9:42
 */
@Repository
@RepositoryRestResource(path = "departments")
public interface DepartmentRepository extends JpaRepository<Department, Long>, QuerydslPredicateExecutor<Department> {
}
