package com.gym.project.user.controller;

import com.gym.project.user.dto.UserDTO;
import com.gym.project.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public String registerUser(UserDTO userDTO){
        userRepository.save(userDTO.toEntity());

        return "redirect:/login";
    }
}
