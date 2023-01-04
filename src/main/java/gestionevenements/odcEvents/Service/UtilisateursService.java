package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.Utilisateurs;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UtilisateursService {
    Utilisateurs addUtilisateur(Utilisateurs utilisateur);
    // Méthode pour mettre à jour un utilisateur
    Utilisateurs updateUtilisateur(Utilisateurs utilisateur);
    // Méthode pour supprimer un utilisateur
    void deleteUtilisateur(Long idUtilisateur);
    // Méthode pour lister tous les utilisateurs
    List<Utilisateurs> getAllUtilisateurs();
    // Méthode pour récupérer un utilisateur par son id
    Utilisateurs getUtilisateurById(Long idUtilisateur);
    // Méthode de connexion d'un utilisateur
    Utilisateurs login(String email, String password);
    // Méthode de déconnexion d'un utilisateur
    void logout(Utilisateurs utilisateur);


}
