package br.com.acert.testetecnico.user;

import br.com.acert.testetecnico.arch.BaseController;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserController extends BaseController<Usuario, Long> {
	public UserController(JpaRepository<Usuario, Long> repository) {
		super(repository);
	}
}
