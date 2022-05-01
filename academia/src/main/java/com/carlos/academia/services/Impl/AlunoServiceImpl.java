package com.carlos.academia.services.Impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.academia.dto.AlunoDto;
import com.carlos.academia.dto.AlunoUpdateDto;
import com.carlos.academia.entities.Aluno;
import com.carlos.academia.entities.AvaliacaoFisica;
import com.carlos.academia.infra.utils.JavaTimeUtils;
import com.carlos.academia.repositories.AlunoRepository;
import com.carlos.academia.services.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

	@Autowired
	private AlunoRepository repository;


	@Override
	public Aluno create(AlunoDto dto) {

		Aluno aluno = new Aluno();
		aluno.setNome(dto.getNome());
		aluno.setCpf(dto.getCpf());
		aluno.setBairro(dto.getBairro());
		aluno.setDataDeNascimento(dto.getDataDeNascimento());

		return repository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {

		return null;
	}

	@Override
	public List<Aluno> getAll(String dataDeNascimento) {
		if (dataDeNascimento == null) {
			return repository.findAll();
		} else {

			LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
			return repository.findByDataDeNascimento(localDate);

		}
	
	}

	@Override
	public Aluno update(Long id, AlunoUpdateDto dtoUpdate) {
		
		return null;
	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
		
		 Aluno aluno = repository.findById(id).get();

		    return aluno.getAvaliacoes();

	}

}
