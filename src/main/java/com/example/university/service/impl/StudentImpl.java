package com.example.university.service.impl;

import com.example.university.model.Student;
import com.example.university.repository.StudentRepository;
import com.example.university.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }
}
