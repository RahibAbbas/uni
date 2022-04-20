package com.example.university.controller;

import com.example.university.model.Student;
import com.example.university.service.impl.StudentImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/student")
public class UniController {
    private final StudentImpl student;

    @GetMapping
    public List<Student> getStudentList() {
        return student.getStudentList();
    }


}
