package com.medical.repository.user;

import com.medical.entity.user.DoctorComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "doctor_comments")
public interface DoctorCommentRepository extends JpaRepository<DoctorComment, Long>, QuerydslPredicateExecutor<DoctorComment> {
}
