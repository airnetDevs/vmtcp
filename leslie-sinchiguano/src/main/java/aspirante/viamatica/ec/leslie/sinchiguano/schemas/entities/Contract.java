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
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contractid")
    private int ContractId;

    private Date StartDate;

    private Date EndDate;

    private int ServiceServiceId;

    private String StatusContractStatusId;

    private int ClientClientId;

    private int MethodPaymentMethodPaymentId;
}
