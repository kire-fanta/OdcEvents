package gestionevenements.odcEvents.Model;
import gestionevenements.odcEvents.Reposotory.UtilisateursRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@Table(name = "utilisateurs")
@Data

@NoArgsConstructor
public class Utilisateurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;

    @NotEmpty
    private String prenom;
    @Email
    @NotEmpty
    private String email;
    @NotEmpty

    private Long numero;
    @NotEmpty
    @Size(min=6, max=20)
    @Pattern(regexp="^(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{6,30}$")
    private String password;
    private String image;
    @NotBlank
    @Size(min = 6)
    private String nom;
    @ManyToMany
    @JoinTable(name = "utilisateur_role",
            joinColumns = @JoinColumn(name = "utilisateur_id", referencedColumnName = "idUtilisateur"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "idRole"))
    private Collection<Role> roles = new ArrayList<>();
    @ManyToMany
    private Collection<Notification> notification;
    @ManyToMany
    private Collection<Tache> tache;


}





