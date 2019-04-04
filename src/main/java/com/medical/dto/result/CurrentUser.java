package com.medical.dto.result;

import com.medical.entity.user.Doctor;
import com.medical.entity.user.Patient;
import com.medical.entity.user.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentUser extends BaseResult {

    private User user;

    private Integer userType;
}
