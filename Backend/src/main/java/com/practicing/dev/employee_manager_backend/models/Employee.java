package com.practicing.dev.employee_manager_backend.models;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;

@Data
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;

    @Column(nullable = false,updatable = false)
    private String employeeCode;

    private String name;

    private String email;

    private String jobTitle;

    private String phone;

    private String image;

}
