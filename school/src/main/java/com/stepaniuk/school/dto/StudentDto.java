package com.stepaniuk.school.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.stepaniuk.student.entitys.Student}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
}