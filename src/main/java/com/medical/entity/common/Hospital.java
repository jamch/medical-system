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
@Table(name = "c_hospitals")
public class Hospital extends BaseEntity {

    private String logo;

    private String name;

    private String address;

    @ManyToOne
    private Dict level;
}
