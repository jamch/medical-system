package com.medical.entity.user;

import com.medical.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "u_user_auths")
public class UserAuth extends BaseEntity {

    @ManyToOne(optional = false)
    private User user;

    @Column(nullable = false)
    private String identityType;

    @Column(nullable = false)
    private String identifier;

    private String credential;
}
