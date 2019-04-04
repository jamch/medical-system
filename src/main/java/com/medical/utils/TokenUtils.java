package com.medical.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.medical.dto.result.CurrentUser;
import com.medical.dto.result.TokenResult;
import com.medical.entity.user.User;
import com.medical.enums.UserTypeEnum;
import com.medical.exceptions.ServiceException;
import com.medical.repository.user.UserRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

@Component
public class TokenUtils {

    private static final Algorithm algorithm = Algorithm.HMAC256("medical_system");

    private static final ThreadLocal<CurrentUser> currentUserLocal = new ThreadLocal<>();

    @Resource
    private UserRepository userRepository;

    public TokenResult buildToken(User user, UserTypeEnum userType) {
        String token = JWT.create()
                .withClaim("userId", user.getId())
                .withClaim("userType", userType.getType())
                .sign(algorithm);
        TokenResult result = new TokenResult();
        result.setToken(token);
        return result;
    }

    public CurrentUser currentUser(String token) {
        if (Objects.nonNull(currentUserLocal.get())) {
            return currentUserLocal.get();
        }
        DecodedJWT verify = JWT.require(algorithm)
                .build()
                .verify(token);
        Long userId = verify.getClaim("userId").asLong();
        Integer userType = verify.getClaim("userType").asInt();

        CurrentUser currentUser = new CurrentUser();
        User user = userRepository.findById(userId).orElseThrow(() -> new ServiceException("bad token"));
        currentUser.setUser(user);
        currentUser.setUserType(userType);

        currentUserLocal.set(currentUser);
        return currentUser;
    }
}
