package BackEnd.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_produto")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"nome","preco", "descricao"})
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_produto;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private float preco;

    @Column(nullable = false)
    private String descricao;
}
