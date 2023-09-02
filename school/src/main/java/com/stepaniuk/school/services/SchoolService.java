package com.stepaniuk.school.services;

import com.stepaniuk.school.client.StudentClient;
import com.stepaniuk.school.dto.SchoolDto;
import com.stepaniuk.school.entitys.School;
import com.stepaniuk.school.exceptions.SchoolNotFoundException;
import com.stepaniuk.school.interfaces.ServiceInterface;
import com.stepaniuk.school.repositories.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService implements ServiceInterface<School> {
    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;
    @Override
    public void save(School school) {
        schoolRepository.save(school);
    }

    @Override
    public List<School> getAll() {
        return schoolRepository.findAll();
    }

    @Override
    public void delete(School school) {
        schoolRepository.delete(school);
    }

    @Override
    public void update(School school) {
        // TODO: Add more complex logic here
        schoolRepository.save(school);
    }

    @Override
    public School getById(Integer id) {
        return schoolRepository.findById(id).orElseThrow(SchoolNotFoundException::new);
    }

    public SchoolDto getByStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId).orElseThrow(SchoolNotFoundException::new);
        var students = studentClient.getAllStudentsBySchool(schoolId);
        return SchoolDto
                .builder()
                .name(school.getName())
                .email(school.getEmail())
                .address(school.getAddress())
                .students(students)
                .build();
    }
}
