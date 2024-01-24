package aspirante.viamatica.ec.leslie.sinchiguano.schemas.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientid")
    private int ClientId;

    private String Name;

    private String LastName;

    private String Identification;

    private String Email;

    private String PhoneNumber;

    private String Address;

    private String ReferenceAddress;
}
