package com.claim.demo.service;

import com.claim.demo.dto.UserDTO;
import com.claim.demo.entity.User;

public interface UserServiceI {
    UserDTO registerUser(User user);

    UserDTO findUserById(Long userId);

    UserDTO updateUser(Long userId, User updatedUser);

    void deleteUser(Long userId);

//    UserDTO loginUser(String username, String password);
}
