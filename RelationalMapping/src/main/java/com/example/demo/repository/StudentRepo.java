package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel, Integer> {

}
