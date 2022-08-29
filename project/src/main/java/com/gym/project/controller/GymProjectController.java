package com.gym.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class GymProjectController {


    public String Hello(Model model){
        return "index.html";
    }


    @GetMapping("/login")
    public String Login(HttpSession session, Model model){
        return "html/login";
    }

    @GetMapping("/join")
    public String Join(HttpSession session, Model model){
        return "html/join";
    }
}
