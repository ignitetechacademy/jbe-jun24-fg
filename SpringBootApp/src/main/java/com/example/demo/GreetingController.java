package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class GreetingController {

	@RequestMapping("/greetz")
	String greets() {
		return "Syam Kakumani - Spring Boot";
	}

}
