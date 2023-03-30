package br.edu.ifms.matricula.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EstudanteRequest {
	@Size(max = 80, message = "Informe o nome completo") // VAI VALIDAR SE O NOME TEM NO MÁXIMO 80 CARACTERES (COMPRIMENTO DA STRING)
	@NotBlank // NÃO VAI PERMITIR QUE O CAMPO FIQUE VAZIO
	private String nome;
	@Size(min = 11)
	@NotBlank
	private String cpf;
	@Size(max = 150, message = "Informe o endereço de E-Mail")
	@NotBlank
	@Email // VALIDA SE É UM ENDEREÇO DE EMAIL
	private String email;
	@Size(max = 50, message = "Informe a senha com até 50 caracteres")
	@NotBlank
	private String senha;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
