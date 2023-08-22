package com.example.demo.day3.q3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class prac_at_home1 {
@Value("1")
public int id;
@Value("Padmapriya")
public String stuname;
@Value("Electrical and Electronics Engineering")
public String studept;
@Value("727721euee062@skcet.ac.in")
public String mailid;
@RequestMapping("/dis")
public String dis() {
	return id+"-"+stuname+"-"+studept+"-"+mailid;
}
}
