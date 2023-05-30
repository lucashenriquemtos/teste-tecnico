package br.com.acert.testetecnico.entrega;

import br.com.acert.testetecnico.pedido.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Entrega")
@Table(name = "entrega")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Entrega {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;

	private String endereco;
	private String status;
}
