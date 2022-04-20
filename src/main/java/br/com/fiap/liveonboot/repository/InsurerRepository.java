package br.com.fiap.liveonboot.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.liveonboot.domain.Insurer;

@Repository
public interface InsurerRepository extends JpaRepository<Insurer, UUID> {

}
