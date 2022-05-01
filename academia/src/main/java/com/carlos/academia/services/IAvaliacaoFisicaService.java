package com.carlos.academia.services;

import java.util.List;

import com.carlos.academia.dto.AvaliacaoFisicaDto;
import com.carlos.academia.dto.AvaliacaofisicaUpdateDto;
import com.carlos.academia.entities.AvaliacaoFisica;

public interface IAvaliacaoFisicaService {

	AvaliacaoFisica create(AvaliacaoFisicaDto dto);

	AvaliacaoFisica get(Long id);

	List<AvaliacaoFisica> getAll();
	
	AvaliacaoFisica update(Long id, AvaliacaofisicaUpdateDto dtoUpdate);
	
	void delete(Long id);

}
