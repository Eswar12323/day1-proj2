package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class proj2 {
	@GetMapping("/")
      public String name() {
    	String Name="ESWAR"; 
		return "Welcome"+Name;
      }
}
