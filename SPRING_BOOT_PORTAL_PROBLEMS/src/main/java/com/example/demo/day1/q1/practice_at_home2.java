package com.example.demo.day1.q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class practice_at_home2 {
@Value("Padmapriya")
public String name;
@Value("213")
public int doorno;
@Value("Vadugapalayam")
public String streetname;
@Value("641107")
public int pincode;
@Value("Kuppepalayam")
public String area;
@Value("Coimbatore")
public String district;
@Value("TamilNadu")
public String state;
@Value("India")
public String country;
@RequestMapping("/getAddress")
public String getAddress() {
	return name+" "+doorno+","+streetname+","+area+","+district+","+state+","+country+"-"+pincode+".";
	
}
}
