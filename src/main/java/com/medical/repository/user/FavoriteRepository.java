package com.medical.repository.user;

import com.medical.entity.user.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "favorites")
public interface FavoriteRepository extends JpaRepository<Favorite, Long>, QuerydslPredicateExecutor<Favorite> {
}
