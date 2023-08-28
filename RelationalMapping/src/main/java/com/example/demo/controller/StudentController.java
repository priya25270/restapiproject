package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepo;

@RestController
@RequestMapping("/") // direct calling
public class StudentController {
	@Autowired
	StudentRepo srepo;

	@PostMapping()
	public StudentModel saveDetails(@RequestBody StudentModel sm) {
		return srepo.save(sm);
	}

	@GetMapping()
	public List<StudentModel> getDetails()

	{
		return srepo.findAll();
	}

	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		srepo.deleteById(id);
		return "The id" + id + " is deleted";
	}
}
