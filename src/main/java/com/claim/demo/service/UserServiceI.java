package com.claim.demo.service;

import com.claim.demo.dto.UserDTO;
import com.claim.demo.entity.User;

public interface UserServiceI {
    UserDTO registerUser(User user);
}
