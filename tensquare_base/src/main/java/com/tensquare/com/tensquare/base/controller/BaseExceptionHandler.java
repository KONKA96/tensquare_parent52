package com.tensquare.com.tensquare.base.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseExceptionHandler {
    public Result exception(Exception e){
        return new Result(false, StatusCode.ERROR,e.getMessage());
    }
}
