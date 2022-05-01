package com.carlos.academia.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaDto {

	@NotNull(message = "Preencha o campo corretamente.")
	@Positive(message = "O Id do aluno precisa ser positivo.")
	private Long alunoId;
}
