package com.main.webserver.controller;

import com.main.webserver.dto.UserDTO;

import com.main.webserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String showLoginPage() {
        return "login"; // login.html 이동
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // 로그인 처리 로직 (간단하게 인증 확인)
        if (userService.authenticate(username, password)) {
            return "redirect:/upload"; // 로그인 성공 시 대시보드로 리다이렉트
        }
        return "login"; // 로그인 실패 시 다시 로그인 페이지로
    }

    @GetMapping("/register")
    public String showSignupPage() {
        return "signup"; // signup.html로 이동
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        userService.registerUser(new UserDTO(username, password));
        return "redirect:/auth/login";
    }
}
