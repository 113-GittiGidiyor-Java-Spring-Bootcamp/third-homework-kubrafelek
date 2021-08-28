package com.kubrafelek.devpatika.controller;

import com.kubrafelek.devpatika.entity.Student;
import com.kubrafelek.devpatika.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Can list all students data
    @GetMapping("/students")
    public ResponseEntity<List<Student>> findAll() {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    //Can find student using by id
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int id) {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }

    //Can save student to database
    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    //Can update student data
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.update(student);
    }

    //Can delete student by using id
    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentService.deleteById(id);
    }


    //Can delete student by using student name
    @DeleteMapping("/deleteByName/{name}")
    public void deleteByStudentName(@PathVariable String name) {
        studentService.deleteByName(name);
    }

    //Can find student with a name
    @GetMapping("/findByName/{name}")
    public void findByStudentName(@PathVariable String name) {
        studentService.findByName(name);
    }

    //Students group with a gender
    @GetMapping("/getGenderWithGrouping")
    public List<?> getGenderWithGrouping() {
        return studentService.getGenderWithGrouping();
    }

}