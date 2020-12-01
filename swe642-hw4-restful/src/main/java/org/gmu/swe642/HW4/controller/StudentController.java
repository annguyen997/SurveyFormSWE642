package org.gmu.swe642.HW4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.gmu.swe642.HW4.domain.*;
import org.gmu.swe642.HW4.repository.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired()
    private StudentRepo studentRepo;

    @GetMapping("/students/{stdid}")
    public Student studentInfo(@PathVariable String stdid) {
        return studentRepo.findByStdid(stdid);
    }

    @PostMapping("/students")
    public Student studentInfo(@RequestBody Student student) {
        System.out.println(student);
        return studentRepo.save(student);
    }

    @GetMapping("/students")
    public List<String> idList() {
        Iterable<Student> students = studentRepo.findAll();
        return StreamSupport.stream(students.spliterator(), false).map(Student::getStdId).collect(Collectors.toList());
    }
}
