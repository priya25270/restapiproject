package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.petrolbunk;
import com.example.demo.repository.FuelRepo;

@Service
public class FuelService {
@Autowired
FuelRepo frepo;
public petrolbunk saveDetails(petrolbunk p) {
	return frepo.save(p);
}
public List<petrolbunk> getDetails(){
	return frepo.findAll();
}
}
