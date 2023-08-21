package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.petrolbunk;

public interface FuelRepo extends JpaRepository<petrolbunk,Integer>{

	List<petrolbunk> findAll();

}
