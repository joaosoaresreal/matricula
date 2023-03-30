package br.edu.ifms.matricula.model.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estudante") // NOME DA TABELA QUE SERÁ CRIADA NO BANCO
public class Estudante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // COM ISSO GERA A TABELA
	private UUID id;
	
	@Column(nullable = false, length = 80) // NÃO PODE RECEBER VALOR VAZIO E DEFINE QUANTOS CARACTERES SERÃO USADOS
	private String nome;
	@Column(nullable = false, length = 11)
	private String cpf;
	@Column(nullable = false, length = 150)
	private String email;
	@Column(nullable = false, length = 50)
	private String senha;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
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
