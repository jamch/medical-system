package com.medical.entity.common;

import com.medical.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "c_dicts")
@DynamicInsert
@DynamicUpdate
public class Dict extends BaseEntity {

    private String name;

    private Integer type;
}
