package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.Tache;
import gestionevenements.odcEvents.Model.Utilisateurs;
import gestionevenements.odcEvents.Reposotory.TacheRepository;
import gestionevenements.odcEvents.Reposotory.UtilisateursRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor

public class TacheServiceImpl implements TacheService{
    private TacheRepository TR;
    @Override
    public Tache addTache(Tache tache) {
        return TR.save(tache);
    }

    @Override
    public Tache updateTache(Tache tache) {
        Tache updatedTache = TR.findById(tache.getIdTache()).orElse(null);
        if (updatedTache != null) {
            updatedTache.setNomTache(tache.getNomTache());
            updatedTache.setDescriptionTache(tache.getDescriptionTache());
            updatedTache.setDateEcheance(tache.getDateEcheance());
            updatedTache.setStatutTache(tache.getStatutTache());
            updatedTache.setRoleUser(tache.getRoleUser());
            TR.save(updatedTache);
            return updatedTache;
        } else {
            return null;
        }
    }

    @Override
    public void deleteTache(Long idTache) {
        TR.deleteById(idTache);
    }

    @Override
    public List<Tache> getAllTaches() {
        return TR.findAll();
    }

    @Override
    public Tache getTacheById(Long idTache) {
        return  TR.findById(idTache).orElse(null);
    }

    @Override
    public void assignerTache(Long idTache, Long idUser) {
        Tache tache = TR.findById(idTache).orElse(null);
        if (tache != null) {
            tache.setRoleUser();
            TR.save(tache);
        }

    }

    @Override
    public void modifierDate(Long idTache, Date dateEcheance) {
        Tache updatedTache = TR.findById(idTache).orElse(null);
        if (updatedTache != null) {
            updatedTache.setDateEcheance(dateEcheance);
            TR.save(updatedTache);
        }
    }

}
