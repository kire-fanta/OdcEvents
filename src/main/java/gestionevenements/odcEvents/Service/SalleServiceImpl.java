package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.Salles;
import gestionevenements.odcEvents.Reposotory.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleServiceImpl implements SalleService{
    @Autowired
    SalleRepository salleRepository;

    @Override
    public Salles create(Salles salle) {
        return salleRepository.save(salle);
    }

    @Override
    public Salles read(long id) {
        return salleRepository.findById(id).get();
    }

    @Override
    public Salles update(Salles salle, long id) {

        return salleRepository.save(salle);
    }

    @Override
    public void delete(long id) {
        salleRepository.deleteById(id);
    }

    @Override
    public List<Salles> getAll() {
        return salleRepository.findAll();
    }

    @Override
    public Salles getByLibelle(String libelle) {
        return salleRepository.findByLibelle(libelle);
    }

    @Override
    public Salles getByIdsalle(long id) {
        return salleRepository.findById(id).get();
    }

    @Override
    public List<Salles> ParEtat(Boolean disponibilite) {
        // TODO Auto-generated method stub
        return salleRepository.findByDisponibilite(disponibilite);
    }

}
