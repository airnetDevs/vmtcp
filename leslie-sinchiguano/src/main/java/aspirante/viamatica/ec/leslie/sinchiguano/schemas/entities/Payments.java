package aspirante.viamatica.ec.leslie.sinchiguano.schemas.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentid")
    private int PaymentId;

    private Date PaymentDate;

    private int Client_ClientId;
}
