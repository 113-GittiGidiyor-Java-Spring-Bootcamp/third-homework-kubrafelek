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

    @GetMapping("/students")
    public ResponseEntity<List<Student>> findAll() {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
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

/*    @GetMapping("/getNumberOfStudents")
    public String getNumberOfStudents() {
        int total = studentService.getNumberStudents();
        return "Total Employee number on database: " + total;
    }

    @GetMapping("/getAgesWithGrouping")
    public List<?> getAgesWithGrouping() {
        return studentService.getAgesWithGrouping();
    }

    @GetMapping("/findByName/{name}")
    public List<Student> getStudentsWithName(@PathVariable String name) {
        return studentService.getStudentsWithName(name);
    }*/

}