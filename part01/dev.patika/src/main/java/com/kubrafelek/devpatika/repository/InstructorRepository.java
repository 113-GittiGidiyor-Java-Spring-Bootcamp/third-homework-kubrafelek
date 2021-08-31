package com.kubrafelek.devpatika.repository;

import com.kubrafelek.devpatika.entity.Instructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Integer> {

    List<Instructor> findByName(String name);
    void deleteByName(String name);
/*
    @Query("select max(i) from Instructor i")
    int getMaxSalaryInstructors();

    @Query("select min(i) from Instructor i ")
    int getMinSalaryInstructors();*/
}
