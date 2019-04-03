package com.medical.entity.registration;

import com.medical.entity.BaseEntity;
import com.medical.entity.common.Department;
import com.medical.entity.common.Hospital;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "r_registrations_source")
public class RegistrationSource extends BaseEntity {

    @OneToMany(mappedBy = "source")
    private List<Registration> registrations;

    @ManyToOne
    private Hospital hospital;

    @ManyToOne
    private Department department;

    private Date startAt;

    private Date endAt;

    private Integer fee;
}
