package gestionevenements.odcEvents.Reposotory;

import gestionevenements.odcEvents.Model.Evenements;
import gestionevenements.odcEvents.Model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Tache,Long>  {
}
