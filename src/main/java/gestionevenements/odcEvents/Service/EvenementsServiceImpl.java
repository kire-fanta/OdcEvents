package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.Evenements;

import gestionevenements.odcEvents.Reposotory.EvenementsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EvenementsServiceImpl implements EvenementsService{
    private EvenementsRepository ER;
    @Override
    public Evenements addEvenement(Evenements evenement) {
        return  ER.save(evenement);
    }

    @Override
    public Evenements updateEvenement(Evenements evenement) {Evenements updatedEvenement = ER.findById(evenement.getIdEvenement()).orElse(null);
        if (updatedEvenement != null) {
            updatedEvenement.setNomEvenement(evenement.getNomEvenement());
            updatedEvenement.setDate(evenement.getDate());
            updatedEvenement.setHeure(evenement.getHeure());
            updatedEvenement.setTypeEvenement(evenement.getTypeEvenement());

            ER.save(updatedEvenement);
            return updatedEvenement;
        } else {
            return null;
        }

    }

    @Override
    public void deleteEvenement(Long idEvenement) {
        ER.deleteById(idEvenement);
    }

    @Override
    public List<Evenements> getAllEvenements() {
        return ER.findAll();
    }

    @Override
    public Evenements getEvenementById(Long idEvenement) {
        return ER.findById(idEvenement).orElse(null);
}
}
