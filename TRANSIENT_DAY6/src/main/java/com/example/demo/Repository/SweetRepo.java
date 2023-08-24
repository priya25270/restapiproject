package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Transientmodel;

public interface SweetRepo extends JpaRepository<Transientmodel, Integer> {

}
