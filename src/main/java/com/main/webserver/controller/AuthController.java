package com.main.webserver.controller;

import com.main.webserver.dto.UserDTO;

import com.main.webserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class AuthController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String showLoginPage() {
        return "login"; // login.html 이동
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if (userService.authenticate(username, password)) {
            return "upload";  // 로그인 성공 시 업로드 페이지로 이동
        }
        return "login";  // 로그인 실패 시 다시 로그인 페이지
    }

    @RequestMapping("/upload")
    public String showUploadPage() {
        return "upload"; // signup.html로 이동
    }

    @RequestMapping("/register")
    public String showSignupPage() {
        return "signup"; // signup.html로 이동
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        userService.registerUser(new UserDTO(username, password));
        return "redirect:/login";  // 회원가입 후 로그인 페이지로 리디렉션
    }
}
