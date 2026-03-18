package BackEnd.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_fila")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"senhaFila", "pedidoSolicitado", " pedidoPronto"})
public class Fila {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idFila;

    @Column(nullable = false, length = 30)
    private String senhaFila;

    @Column(nullable = false)
    private Date pedidoSolicitado;

    private Date pedidoPronto;

    @OneToMany(mappedBy = "fila")
    @JoinColumn(name = "id_cliente")
    private List<Cliente> pedidoCliente;
}
