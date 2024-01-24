package aspirante.viamatica.ec.leslie.sinchiguano.schemas.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deviceid")
    private int DeviceId;

    @NotEmpty
    @NotBlank
    @NotNull
    @Column(name = "devicename", length = 50, nullable = false)
    private String DeviceName;

    @ManyToOne
    @JoinColumn(name = "service_serviceid", nullable = false)
    private Service ServiceServiceId;

}
