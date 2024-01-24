package aspirante.viamatica.ec.leslie.sinchiguano.schemas.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "attention")
public class Attention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attentionid")
    private int AttentionId;

    private int TurnTurnId;

    private int ClientClientId;

    private String AttentionTypeAttentionTypeId;

    private int AttentionStatusStatusId;
}
