package com.example.demo.day2.q2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class practiceathome {
@Value("Have a great day!")
public String message;
@RequestMapping("/dismsg")
public String dismsg() {
	return message;
}
}
