package com.medical.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.medical.entity.BaseEntity;
import com.medical.entity.registration.Registration;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "u_users")
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
public class User extends BaseEntity {

    @Column(nullable = false)
    private String name;

    private String avatar;

    private Integer sex;

    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<UserAuth> userAuths;
}
