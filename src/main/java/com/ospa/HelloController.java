package com.ospa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ospa.dto.ApiResponse;

@RestController
public class HelloController {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
    

    @RequestMapping("/")
    String hello() {
        return "Hello World!";
    }

    @RequestMapping("/users")
    ApiResponse<String> users() {
        return new ApiResponse<String>(null, "Hello Users!");
    }
}