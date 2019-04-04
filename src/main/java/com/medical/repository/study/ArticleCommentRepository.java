package com.medical.repository.study;

import com.medical.entity.study.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "article_comments")
public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long>, QuerydslPredicateExecutor<ArticleComment> {
}
