package aspirante.viamatica.ec.leslie.sinchiguano.schemas.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serviceid")
    private int serviceId;

    private String ServiceName;

    private String ServiceDescription;

    private String Price;

}
