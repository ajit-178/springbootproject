package com.mortars.springbootproject.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServiceClass {

	public void run() {
		log.debug("new service class is created");
	}
}
