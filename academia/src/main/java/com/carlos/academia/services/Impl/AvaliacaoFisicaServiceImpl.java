package com.carlos.academia.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.academia.dto.AvaliacaoFisicaDto;
import com.carlos.academia.dto.AvaliacaofisicaUpdateDto;
import com.carlos.academia.entities.Aluno;
import com.carlos.academia.entities.AvaliacaoFisica;
import com.carlos.academia.repositories.AlunoRepository;
import com.carlos.academia.repositories.AvaliacaoFisicaRepository;
import com.carlos.academia.services.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

	@Autowired
	private AlunoRepository alunoRepository;

	@Override

	public AvaliacaoFisica create(AvaliacaoFisicaDto dto) {
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(dto.getAlunoId()).get();

		avaliacaoFisica.setAluno(aluno);
		avaliacaoFisica.setPeso(dto.getPeso());
		avaliacaoFisica.setAltura(dto.getAltura());
		return avaliacaoFisicaRepository.save(avaliacaoFisica);
	}

	@Override
	public AvaliacaoFisica get(Long id) {

		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		
		return avaliacaoFisicaRepository.findAll();
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaofisicaUpdateDto dtoUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
