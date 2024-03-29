package com.example.demo.domain.user.presentation.dto.request;

import com.example.demo.domain.user.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSignupRequest {

    private String email;
    private String password;
    private String passwordValid;
    private String emailCodeValid;
}
