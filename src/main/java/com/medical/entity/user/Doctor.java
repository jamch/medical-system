package com.medical.entity.user;

import com.medical.entity.BaseEntity;
import com.medical.entity.common.Department;
import com.medical.entity.common.Dict;
import com.medical.entity.common.Hospital;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "u_doctors")
@DynamicInsert
@DynamicUpdate
public class Doctor extends BaseEntity {

    @OneToOne(optional = false, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    private User user;

    private String description;

    @ManyToOne
    private Dict level;

    @ManyToOne
    private Hospital hospital;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
    private List<DoctorComment> comments;

    private Integer score;
}
