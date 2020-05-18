package com.example;

import javax.inject.Inject;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller(value = "/teste")
public class TesteController {
	
	@Inject
	MyDao dao;
	
	@Get(produces = MediaType.TEXT_PLAIN)
	public String teste() {
		return dao.find().toString();
	}
}
