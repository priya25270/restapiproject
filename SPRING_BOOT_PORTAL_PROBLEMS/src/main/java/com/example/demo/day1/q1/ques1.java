package com.example.demo.day1.q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ques1 {
@Value("Welcome Spring boot!")
public String msg;
@RequestMapping("/welcome")
public String welcome() {
	return msg;
}
}
