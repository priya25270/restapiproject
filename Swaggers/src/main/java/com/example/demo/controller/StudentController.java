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

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/") // direct calling
public class StudentController {
	@Autowired
	StudentRepo srepo;
	@Tag(name="post details",description = "Post all details in database")
	@PostMapping()
	public StudentModel saveDetails(@RequestBody StudentModel sm) {
		return srepo.save(sm);
	}
 @Tag(name="get details",description = "Get all details in database")
	@GetMapping()
	public List<StudentModel> getDetails()

	{
		return srepo.findAll();
	}
 @Tag(name="delete details",description = "Delete all details in database")
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		srepo.deleteById(id);
		return "The id" + id + " is deleted";
	}
}
