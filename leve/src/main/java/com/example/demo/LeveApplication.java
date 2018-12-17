package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Aluno;
import com.example.demo.service.AlunoService;


@SpringBootApplication
public class LeveApplication implements CommandLineRunner{
	
	@Autowired
	AlunoService service;
	
	public static void main(String[] args) {
		SpringApplication.run(LeveApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}
	

}


