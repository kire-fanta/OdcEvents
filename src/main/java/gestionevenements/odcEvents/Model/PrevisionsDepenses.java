package gestionevenements.odcEvents.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PDepense ")
@Data

@NoArgsConstructor
public class PrevisionsDepenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;
    private float prixUnitaire;
    private int quantite;
}
