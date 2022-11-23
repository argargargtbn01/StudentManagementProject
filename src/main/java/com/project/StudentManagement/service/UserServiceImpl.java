package com.project.StudentManagement.service;

import com.project.StudentManagement.entity.User;
import com.project.StudentManagement.model.dto.UserDto;
import com.project.StudentManagement.model.mapper.UserMapper;
import com.project.StudentManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getListUser() {
        List<User> users = userRepository.findAll();
        List<UserDto> userDto = new ArrayList<>();
        for (User user: users){
            userDto.add(UserMapper.toUserDto(user));
        }
        return userDto;
    }
}
