package com.medical.entity.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.medical.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "u_user_auths")
public class UserAuth extends BaseEntity {

    @JsonBackReference
    @ManyToOne
    private User user;

    private String identityType;

    private String identifier;

    private String credential;
}
