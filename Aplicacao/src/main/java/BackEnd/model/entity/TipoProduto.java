package BackEnd.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_tipo_produto")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"descricao"})
public class TipoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idTipoProduto;

    @Column(nullable = false)
    private String descricao;
}
