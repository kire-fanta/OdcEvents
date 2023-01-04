package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.Evenements;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EvenementsService {
    Evenements addEvenement(Evenements evenement);
    Evenements updateEvenement(Evenements evenement);
    void deleteEvenement(Long idEvenement);
    List<Evenements> getAllEvenements();
    Evenements getEvenementById(Long idEvenement);
}


