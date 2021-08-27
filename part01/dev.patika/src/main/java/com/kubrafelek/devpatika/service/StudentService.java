package com.kubrafelek.devpatika.service;

import com.kubrafelek.devpatika.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements BaseService<Student>{
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Student save(Student object) {
        return null;
    }

    @Override
    public Student update(Student object) {
        return null;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }
}
