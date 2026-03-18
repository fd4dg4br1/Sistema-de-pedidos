package BackEnd.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
}
