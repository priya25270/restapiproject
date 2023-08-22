package com.example.demo.day2.q2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class q1 {
@Value("PADMAPRIYA KARTHIKEYAN")
public String name;
@RequestMapping("/disname")
public String disname() {
	return name;
}
}
