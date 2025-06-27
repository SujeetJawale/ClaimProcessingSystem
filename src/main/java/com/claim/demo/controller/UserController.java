package com.claim.demo.controller;

import com.claim.demo.dto.UserDTO;
import com.claim.demo.entity.User;
import com.claim.demo.service.UserServiceI;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceI userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> registerUser(@RequestBody User user, HttpServletRequest request) {
        UserDTO registeredUser = userService.registerUser(user);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

}
