package com.stepaniuk.school.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.stepaniuk.school.entitys.School}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SchoolDto implements Serializable {
    String name;
    String email;
    String address;
    List<StudentDto> students;
}