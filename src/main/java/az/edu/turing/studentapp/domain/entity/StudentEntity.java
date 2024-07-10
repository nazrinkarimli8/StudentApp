package az.edu.turing.studentapp.domain.entity;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentEntity {
    private Long id;
    private String name;
    private Integer age;
    private Boolean gender;
    private Double grade;
    private Long studentNumber;
}
