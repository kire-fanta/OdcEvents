package gestionevenements.odcEvents.Reposotory;

import gestionevenements.odcEvents.Model.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateursRepository extends JpaRepository <Utilisateurs,Long > {
    Utilisateurs findByEmailAndPassword(String email, String password);
}
