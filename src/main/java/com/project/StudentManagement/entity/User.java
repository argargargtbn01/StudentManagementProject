package com.project.StudentManagement.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
@Data
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String phoneNumber;
    private String password;
    private String fullName;
    private String address;
    private String dateOfBirth;
    private String token;
    private int role;
}
