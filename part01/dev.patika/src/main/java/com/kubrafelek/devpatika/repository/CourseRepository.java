package com.kubrafelek.devpatika.repository;

import com.kubrafelek.devpatika.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
}
