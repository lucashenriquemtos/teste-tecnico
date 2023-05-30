package br.com.acert.testetecnico.user;

import br.com.acert.testetecnico.arch.BaseController;
import org.springframework.data.jpa.repository.JpaRepository;

public class UsuarioController extends BaseController {
	public UsuarioController(JpaRepository repository) {
		super(repository);
	}
}
