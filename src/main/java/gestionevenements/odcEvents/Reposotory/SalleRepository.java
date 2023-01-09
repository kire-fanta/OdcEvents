package gestionevenements.odcEvents.Reposotory;

import gestionevenements.odcEvents.Model.Role;
import gestionevenements.odcEvents.Model.Salles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salles,Long>  {
    List<Salles> findByDisponibilite(Boolean disponibilite);

    Salles findByLibelle(String libelle);
}
