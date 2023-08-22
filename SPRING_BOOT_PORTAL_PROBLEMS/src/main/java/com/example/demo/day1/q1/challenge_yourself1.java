package com.example.demo.day1.q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class challenge_yourself1 {
@Value("Mridula")
public String name;
@Value("15")
public int age;
@Value("Sister")
public String relation;
@RequestMapping("/family")
public String family() {
	return name+"-"+age+"-"+relation;
}

}
