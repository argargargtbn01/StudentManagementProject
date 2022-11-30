package com.project.StudentManagement.controller.auth;


import com.project.StudentManagement.entity.User;
import com.project.StudentManagement.model.dto.UserDto;
import com.project.StudentManagement.repository.UserRepository;
import com.project.StudentManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

}
