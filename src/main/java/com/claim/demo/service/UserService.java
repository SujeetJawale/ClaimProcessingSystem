package com.claim.demo.service;

import com.claim.demo.dto.UserDTO;
import com.claim.demo.entity.User;
import com.claim.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService implements UserServiceI{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDTO registerUser(User user) {
        user.setPasswordHash(passwordEncoder.encode(user.getPasswordHash()));
        user.setCreatedAt(new Date());
        user.setStatus("active");
        return convertToDTO(userRepository.save(user));
    }

    private UserDTO convertToDTO(User user){
        return new UserDTO(
                user.getUserId(),
                user.getUsername(),
                user.getEmail(),
                user.getRole(),
                user.getRole()
        );
    }
}
