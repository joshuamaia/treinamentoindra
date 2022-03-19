package com.indracompany.treinamento.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.indracompany.treinamento.model.entity.Cliente;

public interface ClienteRepository extends GenericCrudRepository<Cliente, Long>{
	
	List<Cliente> findByCpf(String cpf);
	
	@Query("FROM Cliente c WHERE LOWER(c.nome) like %:nome%")
	List<Cliente> buscarPorNome(@Param("nome") String nome);
	

}
