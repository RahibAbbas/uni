package com.example.university.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "professor", catalog = "universitydb")
public class Professor {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column
    private Integer idProfessor;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private Instant dateOfBirth;
    @Column
    private String gender;

}
