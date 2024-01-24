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
@Table(name = "userstatus")
public class UserStatus {

    @Id
    @Column(name = "statusid", length = 3)
    private String StatusId;

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(name = "description", length = 50)
    private String Description;
}
