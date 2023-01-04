package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.PrevisionsDepenses;
import gestionevenements.odcEvents.Reposotory.PrevisionsDepensesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PrevisionsDepensesServiceImpl implements PrevisionsDepensesService{
    private PrevisionsDepensesRepository repository;
    @Override
    public float calculerDepense(PrevisionsDepenses prevision) {
        return  prevision.getPrixUnitaire() * prevision.getQuantite();
    }

    @Override
    public PrevisionsDepenses gererPrevision(PrevisionsDepenses prevision) {
        return repository.save(prevision);
    }

    @Override
    public List<PrevisionsDepenses> getAllPrevisions() {
        return repository.findAll();
    }

    @Override
    public void supprimerPrevision(Long idPrevision) {
        repository.deleteById(idPrevision);
    }

    @Override
    public PrevisionsDepenses getPrevisionById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
