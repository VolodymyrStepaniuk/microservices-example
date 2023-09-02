package com.stepaniuk.school.repositories;

import com.stepaniuk.school.entitys.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}