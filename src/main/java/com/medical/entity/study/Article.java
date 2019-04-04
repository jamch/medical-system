package com.medical.entity.study;

import com.medical.entity.BaseEntity;
import com.medical.entity.user.Favorite;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "s_articles")
@DynamicInsert
@DynamicUpdate
public class Article extends BaseEntity {

    private String title;

    private String content;

    private String coverPic;

    private String videoP;

    private Integer lookNum;

    private Integer favoriteNum;

    @OneToMany(mappedBy = "article", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<ArticleComment> comments;

    @OneToMany(mappedBy = "article")
    private List<Favorite> favorites;
}
