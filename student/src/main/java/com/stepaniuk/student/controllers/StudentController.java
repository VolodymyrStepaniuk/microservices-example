package com.stepaniuk.student.controllers;

import com.stepaniuk.student.entitys.Student;
import com.stepaniuk.student.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        studentService.save(student);
    }
    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(studentService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
        return ResponseEntity.ok(studentService.getById(id));
    }
    @GetMapping("/school/{schoolId}")
    public ResponseEntity<List<Student>> getAllStudentsBySchool(@PathVariable Integer schoolId){
        return ResponseEntity.ok(studentService.getBySchoolId(schoolId));
    }
}
