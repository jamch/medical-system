package com.medical.controller.user;

import com.medical.dto.param.CreateUserParam;
import com.medical.entity.user.Doctor;
import com.medical.entity.user.Patient;
import com.medical.entity.user.User;
import com.medical.entity.user.UserAuth;
import com.medical.enums.UserSexEnum;
import com.medical.enums.UserTypeEnum;
import com.medical.repository.user.DoctorRepository;
import com.medical.repository.user.PatientRepository;
import com.medical.repository.user.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RequestMapping(value = "users")
@RestController
public class UserController {

    @Resource
    private UserRepository userRepository;

    @Resource
    private DoctorRepository doctorRepository;

    @Resource
    private PatientRepository patientRepository;

    @PostMapping
    public User create(@RequestBody @Valid CreateUserParam param) {
        User user = new User();
        BeanUtils.copyProperties(param, user);
        user.setName(param.getPhone());
        user.setSex(UserSexEnum.UNKNOW);
        UserAuth phoneUserAuth = new UserAuth();
        phoneUserAuth.setUser(user);
        phoneUserAuth.setIdentifier(param.getPhone());
        phoneUserAuth.setIdentityType("phone");
        UserAuth wxOpenIdUserAuth = new UserAuth();
        wxOpenIdUserAuth.setUser(user);
        wxOpenIdUserAuth.setIdentifier(param.getOpenId());
        wxOpenIdUserAuth.setIdentityType("wx");
        user.setUserAuths(List.of(phoneUserAuth, wxOpenIdUserAuth));

        userRepository.save(user);

        if (param.getUserType().equals(UserTypeEnum.PATIENT)) {
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
