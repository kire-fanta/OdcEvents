package gestionevenements.odcEvents.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "Evenements")
@Data

@NoArgsConstructor
public class Evenements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvenement;
    private String nomEvenement;
    private Date date;
    private int heure;
    private String typeEvenement;
    private int duree;
    private boolean etat;
    private String description;
    private String lieu;
    @ManyToMany
    @JoinTable(name = "evenement_utilisateur",
            joinColumns = @JoinColumn(name = "evenenment_id", referencedColumnName = "idEvenement"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id", referencedColumnName = "idUtilisateur"))
    private Collection<Utilisateurs> utilisateurs = new ArrayList<>();
    @OneToMany
    private List<Tache> taches;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<PrevisionsDepenses> previsionsDepenses;

    @ManyToOne
    @JoinColumn(name = "salles_id")
    private Salles salles;

    public Salles getSalles() {
        return salles;
    }

    public void setSalles(Salles salles) {
        this.salles = salles;
    }

}
