package BackEnd.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_pedido")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"status"})
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_pedido;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
