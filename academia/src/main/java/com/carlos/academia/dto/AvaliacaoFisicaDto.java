package com.carlos.academia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaDto {
	
	private Long alunoId;
	private Double peso;
	private Double altura;

}
