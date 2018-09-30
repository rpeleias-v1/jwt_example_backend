package com.rodrigopeleias.jwtexample.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private String username;
    private String password;
    private int age;
    private int salary;
}
