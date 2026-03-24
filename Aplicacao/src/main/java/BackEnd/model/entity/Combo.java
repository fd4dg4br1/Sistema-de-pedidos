package BackEnd.model.entity;

import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_combo")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"descricao"})
public class Combo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idCombo;

    private String descricao;

    @OneToMany(mappedBy = "tb_comboProduto")
    @JoinColumn(name = "combo")
    private List<ComboProduto> comboProduto;
}
