package com.project.StudentManagement.service;

import com.project.StudentManagement.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<UserDto> getListUser();
}
