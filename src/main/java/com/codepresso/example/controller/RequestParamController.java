package com.codepresso.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
    @RequestMapping(value = "/post")
    public String getPost(@RequestParam(required = false, defaultValue = "it") String category,
                          @RequestParam Integer id){
        return "You requested " + category + "-" + id + " post";
    }

    @RequestMapping(value = "/user/type/{type}/id/{id}")
    public String getUser(@PathVariable String type,
                          @PathVariable Integer id){
        return "You requested " + type + "-" + id + " user";
    }
}
