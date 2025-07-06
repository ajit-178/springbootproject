package com.mortars.springbootproject.control;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ContollerClass {

	@PostMapping("/api/springms/v1/add")
	public void add() {
		log.debug("new controller class is created");
	}
}
