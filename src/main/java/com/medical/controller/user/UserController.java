package com.medical.controller.user;

import com.medical.dto.param.CreateUserParam;
import com.medical.entity.user.Doctor;
import com.medical.entity.user.Patient;
import com.medical.entity.user.User;
import com.medical.entity.user.UserAuth;
import com.medical.enums.UserTypeEnum;
import com.medical.repository.user.DoctorRepository;
import com.medical.repository.user.PatientRepository;
import com.medical.repository.user.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

public class UserController {

    @Resource
    private UserRepository userRepository;

    @Resource
    private DoctorRepository doctorRepository;

    @Resource
    private PatientRepository patientRepository;

    public User create(@RequestBody CreateUserParam param) {
        User user = new User();
        BeanUtils.copyProperties(param, user);
        UserAuth userAuth = new UserAuth();
        userAuth.setUser(user);
        userAuth.setIdentifier(param.getPhone());
        userAuth.setIdentityType("phone");
        user.setUserAuths(List.of(userAuth));

        userRepository.save(user);

        if (param.getUserType().equals(UserTypeEnum.PATIENT.getType())) {
            Patient patient = new Patient();
            patient.setUser(user);
            patientRepository.save(patient);
        } else {
            Doctor doctor = new Doctor();
            doctor.setUser(user);
            doctorRepository.save(doctor);
        }

        return user;
    }
}
