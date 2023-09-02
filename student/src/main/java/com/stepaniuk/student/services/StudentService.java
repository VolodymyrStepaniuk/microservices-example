package com.stepaniuk.student.services;


import com.stepaniuk.student.entitys.Student;
import com.stepaniuk.student.exceptions.StudentNotFoundException;
import com.stepaniuk.student.interfaces.ServiceInterface;
import com.stepaniuk.student.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements ServiceInterface<Student> {
    private final StudentRepository studentRepository;

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public void update(Student student) {
        // TODO: Add more complex logic here
        studentRepository.save(student);
    }

    @Override
    public Student getById(Integer id) {
       return studentRepository.findById(id).orElseThrow(StudentNotFoundException::new);
    }

    public List<Student> getBySchoolId(Integer id) {
        return studentRepository.findAllBySchoolId(id);
    }
}
