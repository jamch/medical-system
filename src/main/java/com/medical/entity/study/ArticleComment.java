package com.medical.entity.study;

import com.medical.entity.BaseEntity;
import com.medical.entity.user.User;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "s_article_comments")
@DynamicInsert
@DynamicUpdate
public class ArticleComment extends BaseEntity {

    @ManyToOne(optional = false, cascade = {CascadeType.MERGE})
    private Article article;

    @ManyToOne(optional = false, cascade = {CascadeType.MERGE})
    private User user;

    private String content;
}
