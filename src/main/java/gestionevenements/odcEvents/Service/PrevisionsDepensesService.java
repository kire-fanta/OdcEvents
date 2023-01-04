package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.PrevisionsDepenses;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PrevisionsDepensesService {
    float calculerDepense(PrevisionsDepenses prevision);
    PrevisionsDepenses gererPrevision(PrevisionsDepenses prevision);
    List<PrevisionsDepenses> getAllPrevisions();
    void supprimerPrevision(Long idPrevision);

    PrevisionsDepenses getPrevisionById(Long id);
}

