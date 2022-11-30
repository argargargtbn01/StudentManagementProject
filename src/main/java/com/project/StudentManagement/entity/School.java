package com.project.StudentManagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="school")
@Data
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String address;
    @Column
    private String name;
    @OneToMany(mappedBy = "class",fetch = FetchType.LAZY)
    private List<Class> classList;
    @OneToMany(mappedBy = "staff",fetch = FetchType.LAZY)
    private List<Staff> staffList;
}
