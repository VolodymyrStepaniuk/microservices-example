package com.stepaniuk.school.client;

import com.stepaniuk.school.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service",url = "${application.config.student-service.url}")
public interface StudentClient {
    @GetMapping("/school/{schoolId}")
    List<StudentDto> getAllStudentsBySchool(@PathVariable Integer schoolId);
}
