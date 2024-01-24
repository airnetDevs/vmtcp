package aspirante.viamatica.ec.leslie.sinchiguano.schemas.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "attentiontype")
public class AttentionType {

    @Id
    @Column(name = "attentiontypeid")
    private String AttentionTypeId;

    private String Description;
}
