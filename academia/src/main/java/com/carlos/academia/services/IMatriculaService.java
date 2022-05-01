package com.carlos.academia.services;

import java.util.List;

import com.carlos.academia.dto.MatriculaDto;
import com.carlos.academia.entities.Matricula;

public interface IMatriculaService {

	Matricula create(MatriculaDto dto);

	Matricula get(Long id);

	List<Matricula> getAll(String bairro);
	
	void delete(Long id);

}
