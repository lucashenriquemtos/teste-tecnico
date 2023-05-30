package br.com.acert.testetecnico.user;

import br.com.acert.testetecnico.arch.BaseController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<Usuario, Long> {
	public UserController(JpaRepository<Usuario, Long> repository) {
		super(repository);
	}
}
