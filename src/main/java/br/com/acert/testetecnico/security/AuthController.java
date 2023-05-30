package br.com.acert.testetecnico.security;

import br.com.acert.testetecnico.dto.Login;
import br.com.acert.testetecnico.user.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private TokenService tokenService;

	@PostMapping("/login")
	public String login(@RequestBody Login login) {
		UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
				new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword());

		Authentication authenticate = this.authenticationManager
				.authenticate(usernamePasswordAuthenticationToken);

		Usuario usuario = (Usuario) authenticate.getPrincipal();

		return tokenService.gerarToken(usuario);

	}

}
