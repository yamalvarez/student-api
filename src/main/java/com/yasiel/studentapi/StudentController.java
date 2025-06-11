package com.yasiel.studentapi;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = repository.findAll();
        return ResponseEntity.ok(students);  // ✅ 200 OK
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return repository.findById(id)
                .map(student -> ResponseEntity.ok(student))      // ✅ 200 OK
                .orElse(ResponseEntity.notFound().build());      // ❌ 404 Not Found
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student) {
        Student saved = repository.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();  // ✅ 204 No Content
        } else {
            return ResponseEntity.notFound().build();   // ❌ 404 Not Found
        }
    }
}
