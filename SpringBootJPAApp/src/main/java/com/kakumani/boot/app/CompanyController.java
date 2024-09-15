package com.kakumani.boot.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

	@Autowired
	CompanyRepository repo;

	@PostMapping("/company/create")
	String createCompany(@RequestBody Company com) {
		System.out.println(com);
		repo.save(com);

		return "Company Created Successfully";
	}

	@GetMapping("/company/list")
	List<Company> companyList() {
		return repo.findAll();
	}
}
