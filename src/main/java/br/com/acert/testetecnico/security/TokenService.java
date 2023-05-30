package br.com.acert.testetecnico.security;

import br.com.acert.testetecnico.user.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;


@Service
public class TokenService {
	public String gerarToken(Usuario usuario) {
		return JWT.create()
				.withIssuer("Pedidos")
				.withSubject(usuario.getUsername())
				.withClaim("id", usuario.getId())
				.withExpiresAt(LocalDateTime.now()
						.plusMinutes(10)
						.toInstant(ZoneOffset.of("-03:00")))
				.sign(Algorithm.HMAC256("acert"));
	}

	public String getSubject(String token) {
		return JWT.require(Algorithm.HMAC256("acert"))
				.withIssuer("Pedidos")
				.build().verify(token).getSubject();
	}
}
