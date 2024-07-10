package az.edu.turing.studentapp.domain.repository;

import az.edu.turing.studentapp.domain.entity.StudentEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryStudentRepository implements StudentRepository {

    public static List<StudentEntity> STUDENTS;

    @PostConstruct
    public void init() {
        STUDENTS = new ArrayList<>(List.of(
                new StudentEntity(1L, "Nazrin", 20, true, 75.0, 1111L),
                new StudentEntity(2L, "Ali", 22, false, 80.0, 2222L),
                new StudentEntity(3L, "Nicat", 18, false, 70.0, 3333L),
                new StudentEntity(4L, "Lale", 25, true, 75.0, 4444L)));
    }

    @Override
    public StudentEntity save(StudentEntity student) {
        STUDENTS.add(student);
        return student;
    }

    @Override
    public List<StudentEntity> findAll() {
        return STUDENTS;
    }

    @Override
    public Optional<StudentEntity> findById(Long id) {
        return STUDENTS.stream().filter(studentEntity -> studentEntity.getId().equals(id)).findFirst();
    }

    @Override
    public void deleteById(Long id) {
        STUDENTS.removeIf(studentEntity -> studentEntity.getId().equals(id));
    }

}