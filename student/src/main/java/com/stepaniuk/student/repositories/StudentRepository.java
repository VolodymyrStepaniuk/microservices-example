package com.stepaniuk.student.repositories;

import com.stepaniuk.student.entitys.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(Integer id);
}