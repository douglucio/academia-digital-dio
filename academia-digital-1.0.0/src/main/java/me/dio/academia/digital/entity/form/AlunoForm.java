package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

public class AlunoForm {

	@NotEmpty(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 150, message = "'${validatedValue}' campo precisa conter entre {min} e {max} caracteres.")
	private String nome;

	@NotBlank(message = "Preencha o campo corretamente")
	@CPF(message = "'{validatedValue}' é inválido!")
	private String cpf;
	
	@NotBlank(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 150, message = "'${validatedValue}' campo precisa conter entre {min} e {max} caracteres.")
	private String bairro;

	@NotNull(message = "Preencha o campo corretamente")
	@Past(message = "Data '${validatedValue}' é invalida.")
	private LocalDate dataDeNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
}
