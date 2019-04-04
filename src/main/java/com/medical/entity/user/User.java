package com.medical.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.medical.entity.BaseEntity;
import com.medical.enums.UserSexEnum;
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

    private String name;

    private String avatar;

    private UserSexEnum sex;

    @Column(nullable = false)
    private String phone;

    @OneToOne
    private Patient patient;

    @OneToOne
    private Doctor doctor;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    private List<UserAuth> userAuths;
}
