package com.carlos.academia.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.academia.dto.MatriculaDto;
import com.carlos.academia.entities.Matricula;
import com.carlos.academia.services.Impl.MatriculaServiceImpl;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private MatriculaServiceImpl service;

	@PostMapping
	public Matricula create(@Valid @RequestBody MatriculaDto dto) {
		return service.create(dto);
	}

	@GetMapping
	public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
		return service.getAll(bairro);
	}
}
