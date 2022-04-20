package br.com.fiap.liveonboot.rest;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fiap.liveonboot.domain.Establishment;
import br.com.fiap.liveonboot.repository.EstablishmentRepository;

@RestController
@RequestMapping("/establishment")
@CrossOrigin("*")
public class EstablishmentRestController {

	@Autowired
	EstablishmentRepository repository;

	@GetMapping
	public ResponseEntity<List<Establishment>> findAll() {
		List<Establishment> lista = repository.findAll();
		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Establishment> findById(@PathVariable("id") UUID id ) {
		return ResponseEntity.ok( repository.findAll().get(0) );
	}

	@SuppressWarnings("rawtypes")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin("*")
	public ResponseEntity post(@RequestBody Establishment establishment) {
		establishment.setId(UUID.randomUUID());
		repository.save(establishment);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(establishment.getId()).toUri();

		return ResponseEntity.created(location).build();

	}

}
