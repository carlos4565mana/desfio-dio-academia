package com.carlos.academia.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.academia.dto.MatriculaDto;
import com.carlos.academia.entities.Aluno;
import com.carlos.academia.entities.Matricula;
import com.carlos.academia.repositories.AlunoRepository;
import com.carlos.academia.repositories.MatriculaRepository;
import com.carlos.academia.services.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;

	private AlunoRepository alunoRepository;

	@Override
	public Matricula create(MatriculaDto dto) {
		Matricula matricula = new Matricula();
		Aluno aluno = alunoRepository.findById(dto.getAlunoId()).get();

		matricula.setAluno(aluno);
		return matriculaRepository.save(matricula);
	}

	@Override
	public Matricula get(Long id) {
		return matriculaRepository.findById(id).get();
	}

	@Override
	public List<Matricula> getAll(String bairro) {

		if (bairro == null) {
			return matriculaRepository.findAll();
		} else {
			return matriculaRepository.findAlunosMatriculadosBairro(bairro);
		}

	}

	@Override
	public void delete(Long id) {
	}
}
