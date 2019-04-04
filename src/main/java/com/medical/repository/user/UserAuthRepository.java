package com.medical.repository.user;

import com.medical.entity.user.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(exported = false)
public interface UserAuthRepository extends JpaRepository<UserAuth, Long>, QuerydslPredicateExecutor<UserAuth> {
}
