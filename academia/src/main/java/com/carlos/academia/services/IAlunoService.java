package com.carlos.academia.services;

import java.util.List;

import com.carlos.academia.dto.AlunoDto;
import com.carlos.academia.dto.AlunoUpdateDto;
import com.carlos.academia.entities.Aluno;
import com.carlos.academia.entities.AvaliacaoFisica;

public interface IAlunoService {

	
	Aluno create(AlunoDto dto);
	
	Aluno get(Long id);
	
	List<Aluno> getAll(String dataDeNascimento);
	
	Aluno update(Long id, AlunoUpdateDto dtoUpdate);
	
	void delete(Long id);
	
	List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

}
