package br.com.acert.testetecnico.arch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T, ID> {

	private final JpaRepository<T, ID> repository;

	public BaseController(JpaRepository<T, ID> repository) {
		this.repository = repository;
	}

	@GetMapping
	public List<T> getAll() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<T> getById(@PathVariable ID id) {
		return repository.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<T> create(@RequestBody T entity) {
		T savedEntity = repository.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedEntity);
	}

	@PutMapping("/{id}")
	public ResponseEntity<T> update(@PathVariable ID id, @RequestBody T entity) {
		if (!repository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		entity = repository.save(entity);
		return ResponseEntity.ok(entity);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable ID id) {
		if (!repository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
