package com.example.bancolombia.entity;

import lombok.Data;

@Data
@Entity 
@Table(name = "tbl_student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   studentId;
    private String firstName;
    private String lastName;
    private String email;
}