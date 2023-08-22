package com.example.demo.day1.q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class challenge_yourself2 {
@Value("SRI KRISHNA COLLEGE OF ENGINEERING AND TECHNOLOGY")
public String name;
@Value("Electrical and Electronics Engineering")
public String dept;
@Value("B")
public char sec;
@RequestMapping("/college")
public String college() {
	return name+" "+dept+" "+sec;
}
}
