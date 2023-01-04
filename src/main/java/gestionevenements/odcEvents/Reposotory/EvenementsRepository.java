package gestionevenements.odcEvents.Reposotory;

import gestionevenements.odcEvents.Model.Evenements;
import gestionevenements.odcEvents.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementsRepository extends JpaRepository <Evenements,Long> {
}
