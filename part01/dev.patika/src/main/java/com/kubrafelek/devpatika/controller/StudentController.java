package com.kubrafelek.devpatika.controller;

import com.kubrafelek.devpatika.entity.Student;
import com.kubrafelek.devpatika.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity findAll() {
        return new ResponseEntity(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int id) {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.update(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentService.deleteById(id);
    }

}