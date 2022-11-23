package com.project.StudentManagement.model.mapper;

import com.project.StudentManagement.entity.User;
import com.project.StudentManagement.model.dto.UserDto;

public class UserMapper {
    public static UserDto toUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setPhoneNumber(user.getPhoneNumber());
        userDto.setFullName(user.getFullName());
        userDto.setAddress(user.getAddress());
        userDto.setDateOfBirth(user.getDateOfBirth());
        userDto.setToken(user.getToken());
        userDto.setRole(user.getRole());
        return userDto;
    }
}
