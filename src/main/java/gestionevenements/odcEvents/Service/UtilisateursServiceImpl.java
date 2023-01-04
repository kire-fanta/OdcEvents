package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.Utilisateurs;
import gestionevenements.odcEvents.Reposotory.UtilisateursRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class UtilisateursServiceImpl implements UtilisateursService{

    @Autowired
    private UtilisateursRepository utilisateursRepository;
    @Override
    public Utilisateurs addUtilisateur(Utilisateurs utilisateur) {
        utilisateursRepository.save(utilisateur);
        return utilisateur;
    }

    @Override
    public Utilisateurs updateUtilisateur(Utilisateurs utilisateur) {
        utilisateursRepository.save(utilisateur);
        return utilisateur;
    }

    @Override
    public void deleteUtilisateur(Long idUtilisateur) {
        utilisateursRepository.deleteById(idUtilisateur);
    }

    @Override
    public List<Utilisateurs> getAllUtilisateurs() {
        return utilisateursRepository.findAll();
    }

    @Override
    public Utilisateurs getUtilisateurById(Long idUtilisateur) {
        return utilisateursRepository.findById(idUtilisateur).orElse(null);
    }

    @Override
    public Utilisateurs login(String email, String password) {
        return utilisateursRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public void logout(Utilisateurs utilisateur) {

    }
}
