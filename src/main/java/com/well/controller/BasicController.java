package com.well.controller;

import com.alibaba.fastjson.JSON;
import com.well.model.BaseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * RichurLiu
 * 2020/3/27 23:01
 */
@Slf4j
public class BasicController {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleError(Exception e){
        log.error("",e);
        BaseVO jsonVO = new BaseVO();
        jsonVO.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        jsonVO.setMsg(e.getMessage());
        return JSON.toJSONString(jsonVO);
    }
}
