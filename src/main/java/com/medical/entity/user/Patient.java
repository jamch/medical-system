package com.medical.entity.user;

import com.medical.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "u_patients")
@DynamicInsert
@DynamicUpdate
public class Patient extends BaseEntity {

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REMOVE})
    private User user;

    private String phone;

    private String identityNumber;

    private String medicareCareId;

    private String areaCode;
}
