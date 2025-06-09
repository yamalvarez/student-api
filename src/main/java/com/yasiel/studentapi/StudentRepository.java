package com.yasiel.studentapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Spring will create all the basic CRUD methods automatically
}
