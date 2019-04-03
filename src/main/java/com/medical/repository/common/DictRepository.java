package com.medical.repository.common;

import com.medical.entity.common.Dict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author 洪锦城【hongjc@3vjia.com】
 * @since 2019/4/3 9:42
 */
@RepositoryRestResource(path = "dicts")
public interface DictRepository extends JpaRepository<Dict, Long>, QuerydslPredicateExecutor<Dict> {
}
