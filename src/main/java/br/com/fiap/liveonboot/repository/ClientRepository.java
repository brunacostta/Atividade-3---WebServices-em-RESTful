package br.com.fiap.liveonboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.liveonboot.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	
	
}
