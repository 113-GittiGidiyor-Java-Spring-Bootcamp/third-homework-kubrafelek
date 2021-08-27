package com.kubrafelek.devpatika.service;

import com.kubrafelek.devpatika.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements BaseService<Course>{

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public Course save(Course object) {
        return null;
    }

    @Override
    public Course update(Course object) {
        return null;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }
}
