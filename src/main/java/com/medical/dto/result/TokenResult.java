package com.medical.dto.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TokenResult extends BaseResult {

    private String token;
}
