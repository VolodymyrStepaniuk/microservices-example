package com.stepaniuk.school.controllers;

import com.stepaniuk.school.dto.SchoolDto;
import com.stepaniuk.school.entitys.School;
import com.stepaniuk.school.services.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSchool(@RequestBody School school){
        schoolService.save(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> getSchools(){
        return ResponseEntity.ok(schoolService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<School> getSchoolById(@PathVariable Integer id){
        return ResponseEntity.ok(schoolService.getById(id));
    }
    @GetMapping("/students/{schoolId}")
    public ResponseEntity<SchoolDto> getSchoolsByStudents(@PathVariable Integer schoolId){
        return ResponseEntity.ok(schoolService.getByStudents(schoolId));
    }
}
