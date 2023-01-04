package gestionevenements.odcEvents.Controlleur;

import gestionevenements.odcEvents.Model.Utilisateurs;
import gestionevenements.odcEvents.Service.UtilisateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateursController {
    @Autowired
    private UtilisateursService utilisateursService;

    @PostMapping("/add")
    public Utilisateurs addUtilisateur(@RequestBody Utilisateurs utilisateur) {
        return utilisateursService.addUtilisateur(utilisateur);
    }

    @PutMapping("/update")
    public Utilisateurs updateUtilisateur(@RequestBody Utilisateurs utilisateur) {
        return utilisateursService.updateUtilisateur(utilisateur);
    }

    @DeleteMapping("/delete/{idUtilisateur}")
    public void deleteUtilisateur(@PathVariable Long idUtilisateur) {
        utilisateursService.deleteUtilisateur(idUtilisateur);
    }

    @GetMapping("/all")
    public List<Utilisateurs> getAllUtilisateurs() {
        return utilisateursService.getAllUtilisateurs();
    }

    @GetMapping("/{idUtilisateur}")
    public Utilisateurs getUtilisateurById(@PathVariable Long idUtilisateur) {
        return utilisateursService.getUtilisateurById(idUtilisateur);
    }

    @PostMapping("/login")
    public Utilisateurs login(@RequestParam String email, @RequestParam String password) {
        return utilisateursService.login(email, password);
    }

    @PostMapping("/logout")
    public void logout(@RequestBody Utilisateurs utilisateur) {
        utilisateursService.logout(utilisateur);
    }
}
