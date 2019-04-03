package com.medical.entity.common;

import com.medical.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "c_departments")
public class Department extends BaseEntity {

    @ManyToOne
    private Hospital hospital;

    private String name;
}
