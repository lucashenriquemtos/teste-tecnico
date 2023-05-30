package br.com.acert.testetecnico.pedido;

import br.com.acert.testetecnico.arch.BaseController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido, Long> {
	public PedidoController(JpaRepository<Pedido, Long> repository) {
		super(repository);
	}
}
