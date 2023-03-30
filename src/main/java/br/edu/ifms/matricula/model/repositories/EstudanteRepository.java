package br.edu.ifms.matricula.model.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.matricula.model.entities.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, UUID> { // ELE VAI FAZER A INCLUSÃO AUTOMATICA
	
	Boolean existsByEmail(String email);
	Boolean existsByCpf(String cpf); // VAI RETORNAR SOMENTE TRUE OU FALSE
	
	
}
