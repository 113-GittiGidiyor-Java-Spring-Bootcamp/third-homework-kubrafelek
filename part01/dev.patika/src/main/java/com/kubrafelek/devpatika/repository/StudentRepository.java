package com.kubrafelek.devpatika.repository;

import com.kubrafelek.devpatika.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    //Data Jpql üzerinden query yazıldı
/*    @Query("select count(s) from Student s")
    int getNumberOfStudents();

    @Query("select s.age, count(s.age) from Student s GROUP BY s.age")
    List<?> getAgesWithGrouping();

    List<Student> findByName(String s);*/
}
