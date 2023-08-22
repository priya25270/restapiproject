package com.example.demo.day3.q3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class qu1 {
 @Value("1")
 public int id;
 @Value("padmapriya")
 public String empname;
 @Value("19")
 public int age;
 @Value("100000")
 public long salary;
 @RequestMapping("/displaying")
 public String displaying() {
	 return id+"-"+empname+"-"+age+"-"+salary;
 }
}
