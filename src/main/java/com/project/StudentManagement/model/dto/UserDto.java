package com.project.StudentManagement.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private long id;
    private String phoneNumber;
    private String fullName;
    private String address;
    private String dateOfBirth;
    private String token;
    private int role;
}
