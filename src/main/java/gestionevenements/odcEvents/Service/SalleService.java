package gestionevenements.odcEvents.Service;



import gestionevenements.odcEvents.Model.Salles;

import java.util.List;

public interface SalleService {

    // Creer Salle
    Salles create(Salles salle);

    // Afficher une salle par son id
    Salles read(long id);

    // Modifier salle par id
    Salles update(Salles salle, long id);

    // Effacer salle
    void delete(long id);

    List<Salles> getAll();

    // Afficher salle par libelle
    Salles getByLibelle(String libelle);
    Salles getByIdsalle(long id);

    /// list des salles par disponiblite
    List<Salles> ParEtat(Boolean disponibilite);

}
