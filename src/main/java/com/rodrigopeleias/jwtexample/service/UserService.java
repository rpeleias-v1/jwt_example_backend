package com.rodrigopeleias.jwtexample.service;

import com.rodrigopeleias.jwtexample.dto.UserDTO;
import com.rodrigopeleias.jwtexample.model.User;

import java.util.List;

public interface UserService {

    User save(UserDTO user);

    List<User> findAll();

    void delete(long id);

    User findOne(String username);

    User findById(Long id);
}
