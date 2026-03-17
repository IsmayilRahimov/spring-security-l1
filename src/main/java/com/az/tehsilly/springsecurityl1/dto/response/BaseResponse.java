package com.az.tehsilly.springsecurityl1.dto.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseResponse<T> {

    String message;
    boolean success;
    T data;
}
