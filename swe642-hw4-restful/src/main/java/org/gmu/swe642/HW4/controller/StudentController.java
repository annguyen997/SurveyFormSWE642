package org.gmu.swe642.HW4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.gmu.swe642.HW4.domain.*;
import org.gmu.swe642.HW4.repository.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class StudentController {

    @Autowired()
    private StudentRepo studentRepo;

    @GetMapping("/student/{studentId}")
    public Student studentInfo(@PathVariable String studentId) {
        return studentRepo.findByStudentId(studentId);
    }

    @PostMapping("/studentInfo")
    public Student studentInfo(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping("/studentIds")
    public List<String> idList() {
        Iterable<Student> students = studentRepo.findAll();
        return StreamSupport.stream(students.spliterator(), false).map(Student::getStudentId).collect(Collectors.toList());
    }
}
