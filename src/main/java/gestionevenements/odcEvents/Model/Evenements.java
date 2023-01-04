package gestionevenements.odcEvents.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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

}
