package az.edu.turing.studentapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDto {
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private Integer grade;
    private Integer dateOfBirth;


