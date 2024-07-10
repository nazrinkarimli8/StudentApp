package az.edu.turing.studentapp.service;

import az.edu.turing.studentapp.domain.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentEntity save(StudentEntity student);

    List<StudentEntity> findAll();

    StudentEntity findById(Long id);

    void deleteById(Long id);

    SudentEntity update(Long id, StudentEntity student);
}