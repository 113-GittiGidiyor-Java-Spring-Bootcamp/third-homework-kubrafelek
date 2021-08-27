package com.kubrafelek.devpatika.service;

import com.kubrafelek.devpatika.entity.Instructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService implements BaseService<Instructor> {
    @Override
    public List<Instructor> findAll() {
        return null;
    }

    @Override
    public Instructor findById(int id) {
        return null;
    }

    @Override
    public Instructor save(Instructor object) {
        return null;
    }

    @Override
    public Instructor update(Instructor object) {
        return null;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }
}
