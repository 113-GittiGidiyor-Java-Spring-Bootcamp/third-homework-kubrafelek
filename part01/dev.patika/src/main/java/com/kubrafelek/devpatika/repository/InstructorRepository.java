package com.kubrafelek.devpatika.repository;

import com.kubrafelek.devpatika.entity.Instructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Integer> {
}
