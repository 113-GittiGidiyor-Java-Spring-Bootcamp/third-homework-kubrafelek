package com.kubrafelek.devpatika.controller;

import com.kubrafelek.devpatika.entity.Instructor;
import com.kubrafelek.devpatika.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstructorController {

    InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("/instructors")
    public ResponseEntity<List<Instructor>> findAll() {
        return new ResponseEntity<>(instructorService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/instructors/{id}")
    public ResponseEntity<Instructor> findInstructorById(@PathVariable int id) {
        return new ResponseEntity<>(instructorService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/instructors")
    public Instructor saveInstructor(@RequestBody Instructor instructor) {
        return instructorService.save(instructor);
    }

    @PutMapping("/instructors")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.update(instructor);
    }

    @DeleteMapping("/instructors/{id}")
    public void deleteInstructorById(@PathVariable int id) {
        instructorService.deleteById(id);
    }

    //Can delete student by using student name
    @DeleteMapping("/deleteByName/{name}")
    public void deleteByInstructorName(@PathVariable String name) {
        instructorService.deleteByName(name);
    }

    //Can find student with a name
    @GetMapping("/findByName/{name}")
    public void findByInstructorName(@PathVariable String name) {
        instructorService.findByName(name);
    }
}