package com.az.tehsilly.springsecurityl1.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthResponse {

    String accessToken;

    String refreshToken;

    @Builder.Default
    String tokenType = "Bearer";


}
