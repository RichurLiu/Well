package com.well.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RichurLiu
 * 2020/3/23 23:57
 */
@RestController
public class HealthController {

    @RequestMapping(value = "/health/check", method = RequestMethod.GET)
    public String healthCheck(){
        return "OK";
    }
}
