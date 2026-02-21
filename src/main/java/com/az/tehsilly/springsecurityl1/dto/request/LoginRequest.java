package com.az.tehsilly.springsecurityl1.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginRequest {


    @NotBlank(message = "Email must be not empty!")
    @Size(min = 5, max = 25)
    String email;


    @NotBlank(message = "Password must be not empty!")
    @Size(min = 5, max = 25)
    String password;
}
