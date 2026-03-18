package BackEnd.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_cliente")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"nome","cpf"})
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_cliente;

    @Column(nullable = false, length = 60)
    private String nome;

    @Column(unique = true, length = 12)
    private String cpf;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    @ManyToOne
    private Fila fila;

}
