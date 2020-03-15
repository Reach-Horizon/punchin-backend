package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String store()
    {
        System.out.println("called");
        return "wokring";
    }

    @PostMapping("/")
    public String setStore(@RequestBody String something)
    {
        System.out.println("called post" + something);
        return "" + jdbcTemplate
                .queryForObject("select count(*) from test", Integer.class);
    }

}
