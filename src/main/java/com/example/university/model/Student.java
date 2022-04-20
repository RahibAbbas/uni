package com.example.university.model;


import lombok.Data;

import javax.persistence.*;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "student", catalog = "universitydb")
public class Student {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column
    private Integer idStudent;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private Instant dateOfBirth;
    @Column
    private String nameOfThesis;
    @JoinColumn(name = "id_professor")
    @ManyToOne
    private Professor professor;
}
