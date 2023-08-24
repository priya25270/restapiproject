package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.Transientmodel;
import com.example.demo.Service.Sweetserv;


@RestController
public class SweetControl {
@Autowired
public Sweetserv sserv;
//post mapping
@PostMapping("/postSweet")
public String postCandy(@RequestBody Transientmodel tm)
{
	sserv.savesweet(tm);
	return "data saved";
}
//get mapping
@GetMapping("/getSweet")
	public List<Transientmodel>getCandyInfo()
	{
	return sserv.getsweet();
	}
@GetMapping("/sweets/{sweetId}")
public ResponseEntity<?> getUserById(@PathVariable int sweetId){
	Optional<Transientmodel>shope=sserv.getSweetId(sweetId);
	
	if(shope!=null)
	{
		return ResponseEntity.ok(shope); //Return the user's data if available
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Shop not available with ID");
}
}