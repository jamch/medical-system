package com.medical.entity.registration;

import com.medical.entity.BaseEntity;
import com.medical.entity.user.Doctor;
import com.medical.entity.user.User;
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
@Table(name = "r_registrations")
@DynamicInsert
@DynamicUpdate
public class Registration extends BaseEntity {

    @ManyToOne(optional = false)
    private RegistrationSource source;

    @ManyToOne(optional = false)
    private Doctor doctor;

    @ManyToOne(optional = false)
    private User user;
}
