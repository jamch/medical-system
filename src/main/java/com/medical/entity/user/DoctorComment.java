package com.medical.entity.user;

import com.medical.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "u_doctor_comments")
@DynamicInsert
@DynamicUpdate
public class DoctorComment extends BaseEntity {

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Doctor doctor;

    private Integer level;

    private String content;
}
