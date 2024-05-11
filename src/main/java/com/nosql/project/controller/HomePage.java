package com.nosql.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/noSqlProject")
public class HomePage {
    private static final Logger logger = LoggerFactory.getLogger(HomePage.class);


    @GetMapping("/homePage")
    public String homePage(){
        logger.info("info message in homePage method");
        return "HomePage";
    }
}
