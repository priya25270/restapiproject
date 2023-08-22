package com.example.demo.day1.q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ques2 {
@Value("Padmapriya")
public String name;
@RequestMapping("/getname")
public String getname() {
	return "Welcome "+name+" !";
}
}
