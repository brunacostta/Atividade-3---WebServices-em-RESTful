package br.com.fiap.liveonboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.liveonboot.domain.Establishment;

@Repository
public interface EstablishmentRepository extends JpaRepository<Establishment, Long> {

	
	
}
