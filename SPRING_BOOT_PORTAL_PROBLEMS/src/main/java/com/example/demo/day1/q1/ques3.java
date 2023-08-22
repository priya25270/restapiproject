package com.example.demo.day1.q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ques3 {
@Value("blue")
public String getcolor;
@RequestMapping("/getfavcolor")
public String getfavcolor() {
	return "My favorite color is "+getcolor;
}
}
