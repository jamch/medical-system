package com.medical.entity.common;

import com.medical.entity.BaseEntity;
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
@Table(name = "c_departments")
@DynamicInsert
@DynamicUpdate
public class Department extends BaseEntity {

    @ManyToOne(optional = false)
    private Hospital hospital;

    private String name;
}
