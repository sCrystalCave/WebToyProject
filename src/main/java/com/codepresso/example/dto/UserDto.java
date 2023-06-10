package com.codepresso.example.dto;

import java.util.List;

public class UserDto {
    Integer id;
    String name;
    String email;
    List<SpecialtyDto> specialties;

    public UserDto(Integer id, String name, String email, List<SpecialtyDto> specialties) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.specialties = specialties;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<SpecialtyDto> getSpecialties() {
        return specialties;
    }
}
