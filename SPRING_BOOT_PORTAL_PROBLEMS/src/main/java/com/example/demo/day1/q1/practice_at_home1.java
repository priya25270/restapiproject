package com.example.demo.day1.q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class practice_at_home1 {
@Value("padmapriya")
public String name;
@Value("Have a great day!")
public String msg;
@RequestMapping("/displaymsg")
public String displaymsg() {
	return name+" "+msg;
}
}
