package com.codepresso.example.controller;

import com.codepresso.example.dto.SpecialtyDto;
import com.codepresso.example.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping(value = "/user")
    public UserDto getUser(){

        List<SpecialtyDto> specialties = new ArrayList<>();
        specialties.add(new SpecialtyDto("Java", "Advanced"));
        specialties.add(new SpecialtyDto("Spring Boot","Intermediate"));

        return new UserDto(1, "Jin", "jin@codepresso.kr", specialties);
    }

}


//@RestController
//@RequestMapping(value = "/user")
//public class UserController {
//    @RequestMapping(value = "/paid")
//    public String getPaidUser(){
//        return "I'm a paid user.";
//    }
//    @RequestMapping(value = "/enterprise")
//    public String getEnterpriseUser(){
//        return "I'm a enterprise user.";
//    }
//}
