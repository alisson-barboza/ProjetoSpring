package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MatriculaDTO;
import com.example.demo.service.AlunoService;

@RestController
public class MatricularController {

	
	@Autowired
	AlunoService service;
	
	@PostMapping(path = "/matricular")
	public ResponseEntity matricular(@RequestBody MatriculaDTO dto) {
		return service.matricular(dto);
	}
}
