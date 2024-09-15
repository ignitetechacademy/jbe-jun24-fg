package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationsController {

	@RequestMapping("/calc-add/{fv}/{sv}")
	int addition(@PathVariable("fv") int firstValue, @PathVariable("sv") int secondValue) {
		return firstValue + secondValue;
	}

	@RequestMapping("/calc-add-p")
	int additionParams(@RequestParam("f") int firstValue, @RequestParam("s") int secondValue) {
		return firstValue + secondValue;
	}

	// @RequestMapping(name = "/calc-add-body", method = RequestMethod.POST)
	@PostMapping("/calc-add-body")
	int additionBody(@RequestBody Values vls) {
		return vls.getValueOne() + vls.getValueTwo();
	}

}
