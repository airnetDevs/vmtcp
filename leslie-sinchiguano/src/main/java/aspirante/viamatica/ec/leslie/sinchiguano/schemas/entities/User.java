package aspirante.viamatica.ec.leslie.sinchiguano.schemas.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private int UserId;

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(name = "username", nullable = false, length = 50)
    private String UserName;

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(name = "email", nullable = false, length = 100)
    private String Email;

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(name = "password", nullable = false, length = 100)
    private String Password;

    @NotNull
    @NotEmpty
    @NotBlank
    @ManyToOne
    @JoinColumn(name = "rol_rolid", nullable = false)
    private Rol RolRolId;

    @CreatedDate
    @Column(name = "creationdate", nullable = false, insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date CreationDate;

    @NotNull
    @NotEmpty
    @NotBlank
    @Column(name = "usercreate")
    private int UserCreate;

    @NotNull
    @NotEmpty
    @NotBlank
    @Column(name = "userpproval")
    private int UserApproval;

    private Date DateApproval;

    private String UserStatusStatusId;
}
