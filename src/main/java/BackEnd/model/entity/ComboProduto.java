package BackEnd.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_combo_produto")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"preco_combo"})
public class ComboProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idComboProduto;

    @Column(nullable = false)
    private float preco_combo;
}
