package az.edu.turing.studentapp.controller;

import az.edu.turing.studentapp.domain.entity.StudentEntity;
import az.edu.turing.studentapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

     final StudentService studentService;

    @PostMapping("/create")
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentService.save(student);
    }

    @GetMapping("/all")
    public List<StudentEntity> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public StudentEntity updateStudent(@PathVariable Long id, @RequestBody StudentEntity student) {
        return studentService.update(id, student);
    }
}