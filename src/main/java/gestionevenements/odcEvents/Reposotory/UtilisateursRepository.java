package gestionevenements.odcEvents.Reposotory;

import gestionevenements.odcEvents.Model.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateursRepository extends JpaRepository <Utilisateurs,Long > {
    Utilisateurs findByEmailAndPassword(String email, String password);


    Optional<Object> findByEmail(String email);
}
