package br.com.fiap.liveonboot.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fiap.liveonboot.domain.Client;
import br.com.fiap.liveonboot.repository.ClientRepository;

@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ClientRestController {

	@Autowired
	ClientRepository repository;

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> lista = repository.findAll();
		return ResponseEntity.ok(lista);
	}

	@SuppressWarnings("rawtypes")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin("*")
	public ResponseEntity post(@RequestBody Client client) {

		repository.save(client);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(client.getId()).toUri();

		return ResponseEntity.created(location).build();

	}

}
