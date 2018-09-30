package com.rodrigopeleias.jwtexample.controller;

import com.rodrigopeleias.jwtexample.dto.UserDTO;
import com.rodrigopeleias.jwtexample.model.User;
import com.rodrigopeleias.jwtexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> listUser() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getOne(@PathVariable(value = "id") Long id) {
        return userService.findById(id);
    }

    @PostMapping("/signup")
    public User saveUser(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }
}
