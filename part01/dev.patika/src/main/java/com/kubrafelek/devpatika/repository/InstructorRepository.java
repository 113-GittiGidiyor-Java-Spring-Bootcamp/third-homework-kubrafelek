package com.kubrafelek.devpatika.repository;

import com.kubrafelek.devpatika.entity.Instructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Integer> {

    void findByName(String name);

    void deleteByName(String name);

    @Query("select max(i) from Instructor i")
    int getMaxSalaryInstructors();

    @Query("select min(i) from Instructor i")
    int getMinSalaryInstructors();
}
