package com.medical.entity.user;

import com.medical.enums.UserSexEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author 洪锦城【hongjc@3vjia.com】
 * @since 2019/4/4 9:04
 */
@Projection(name = "session", types = UserAuth.class)
public interface UserAuthSession {

    @Value("#{target.user.id}")
    Long getUserId();

    @Value("#{target.user.name}")
    String getName();

    @Value("#{target.user.sex}")
    UserSexEnum getSex();
}
