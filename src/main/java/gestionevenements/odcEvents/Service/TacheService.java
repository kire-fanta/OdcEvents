package gestionevenements.odcEvents.Service;


import gestionevenements.odcEvents.Model.Tache;

import java.util.Date;
import java.util.List;

public interface TacheService {
    Tache addTache(Tache tache);
    Tache updateTache(Tache tache);
    void deleteTache(Long idTache);
    List<Tache> getAllTaches();
    Tache getTacheById(Long idTache);

    void assignerTache(Long idTache, Long idUser);
    void modifierDate(Long idTache, Date dateEcheance);
}
