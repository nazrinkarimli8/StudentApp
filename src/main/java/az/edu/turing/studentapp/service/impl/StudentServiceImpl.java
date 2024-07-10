package az.edu.turing.studentapp.service.impl;

import az.edu.turing.studentapp.domain.entity.StudentEntity;
import az.edu.turing.studentapp.domain.repository.StudentRepository;
import az.edu.turing.studentapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentEntity save(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public StudentEntity update(Long id, StudentEntity student) {
        Optional<StudentEntity> foundedStudent = studentRepository.findById(id);
        if (foundedStudent.isPresent()) {
            StudentEntity updatedStudent = foundedStudent.get();

            updatedStudent.setName(student.getName());
            updatedStudent.setAge(student.getAge());
            updatedStudent.setGrade(student.getGrade());
            updatedStudent.setGender(student.getGender());
            updatedStudent.setStudentNumber(student.getStudentNumber());

            return updatedStudent;
        }
        return null;
    }
}
