package gestionevenements.odcEvents.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "tache")
@Data
@NoArgsConstructor
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTache;
    private String nomTache;
    private String descriptionTache;
    private Date dateEcheance;
    private String statutTache;
    private String roleUser;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private
    Utilisateurs utilisateurs;

    @ManyToOne
    @JoinColumn(name = "salles_id")
    private Salles salles;

    public Salles getSalles() {
        return salles;
    }

    public void setSalles(Salles salles) {
        this.salles = salles;
    }

    public Utilisateurs getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Utilisateurs utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public String getNomTache() {
        return nomTache;
    }

    public void setNomTache(String nomTache) {
        this.nomTache = nomTache;
    }

    public String getDescriptionTache() {
        return descriptionTache;
    }

    public void setDescriptionTache(String descriptionTache) {
        this.descriptionTache = descriptionTache;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public String getStatutTache() {
        return statutTache;
    }

    public void setStatutTache(String statutTache) {
        this.statutTache = statutTache;
    }

    public String getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(String roleUser) {
        this.roleUser = roleUser;
    }

    public void assignerTache(String roleUser) {
        this.roleUser = roleUser;
    }

    public void modifierDate(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public void setRoleUser() {
    }

    public Long getIdTache() {
        return idTache;
    }

}

    
