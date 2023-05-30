package br.com.acert.testetecnico.cliente;

import br.com.acert.testetecnico.pedido.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Cliente")
@Table(name = "cliente")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String telefone;
	private String email;

	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;

}
