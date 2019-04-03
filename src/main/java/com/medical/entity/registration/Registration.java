package com.medical.entity.registration;

import com.medical.entity.BaseEntity;
import com.medical.entity.user.Doctor;
import com.medical.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "r_registrations")
public class Registration extends BaseEntity {

    @ManyToOne
    private RegistrationSource source;

    @ManyToOne
    private Doctor doctor;

    @ManyToOne
    private User user;
}
