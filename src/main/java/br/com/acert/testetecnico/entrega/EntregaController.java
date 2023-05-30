package br.com.acert.testetecnico.entrega;

import br.com.acert.testetecnico.arch.BaseController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entregas")
public class EntregaController extends BaseController<Entrega, Long> {
	public EntregaController(JpaRepository<Entrega, Long> repository) {
		super(repository);
	}
}
