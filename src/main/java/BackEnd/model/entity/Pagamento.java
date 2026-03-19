package BackEnd.model.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_pagamento")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"tipo_pagamento","preco"})
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_pagamento;

    @Column(nullable = false)
    private String tipo_pagamento;

    @Column(nullable = false)
    private float preco;
}
