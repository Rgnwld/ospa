package com.ospa.settings.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/setting")
public class HelloController {

    
    @GetMapping("/")
    public String getMethodName(@RequestParam String param) {
        String resp = "Hello World! " + param;
        return resp;
    }
}