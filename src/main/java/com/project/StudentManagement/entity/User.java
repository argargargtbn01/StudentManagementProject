package com.project.StudentManagement.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name="user")
@Data
public class User {
    @Id // => not null and primary key
    @GeneratedValue(strategy= GenerationType.IDENTITY) // => auto_increment
    private int id;
    @Column
    private String phoneNumber;
    @Column
    private String password;
    @Column
    private String fullName;
    @Column
    private String address;
    @Column
    private String dateOfBirth;
    @Column
    private String token;
    @Column
    private int role; // 0: student, 1: teacher,2: administrative staff
}
