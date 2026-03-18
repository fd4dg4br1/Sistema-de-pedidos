package BackEnd.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_pedido_produto")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"valor_total"})
public class PedidoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_pedido_produto;

    @Column(nullable = false)
    private float valor_total;
}
