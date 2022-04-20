package br.com.fiap.liveonboot.rest;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

import br.com.fiap.liveonboot.domain.Insurer;
import br.com.fiap.liveonboot.repository.InsurerRepository;

@RestController
@RequestMapping("/insurer")
@CrossOrigin("*")
public class InsurerRestController {

	@Autowired
	InsurerRepository repository;

	@GetMapping
	public ResponseEntity<List<Insurer>> findAll() {
		List<Insurer> lista = repository.findAll();
		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Insurer> findById(@PathVariable("id") UUID id ) {
		return ResponseEntity.ok( repository.findById(id).get() );
	}
	
	

	@SuppressWarnings("rawtypes")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin("*")
	public ResponseEntity post(@RequestBody Insurer funcionario) {
		funcionario.setId(UUID.randomUUID());
		repository.save(funcionario);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(funcionario.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	
}
