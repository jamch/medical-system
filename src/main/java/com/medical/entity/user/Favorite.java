package com.medical.entity.user;

import com.medical.entity.BaseEntity;
import com.medical.entity.study.Article;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "u_favorites")
@DynamicInsert
@DynamicUpdate
public class Favorite extends BaseEntity {

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Article article;
}
