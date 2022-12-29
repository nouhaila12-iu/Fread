package com.fread.freadbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fread.freadbackend.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor,Integer> {

    Instructor findInstructorByUsername(String username);
    Boolean existsInstructorByUsername(String username);
    Boolean existsInstructorByEmail(String email);
    void removeInstructorByUsername(String username);
}