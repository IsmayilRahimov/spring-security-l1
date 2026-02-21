package com.az.tehsilly.springsecurityl1.dto.response;

public class BaseResponse<T> {

    String message;
    boolean success;
    T data;
}
