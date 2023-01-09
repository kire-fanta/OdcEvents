package gestionevenements.odcEvents.Controlleur;

import gestionevenements.odcEvents.Model.Utilisateurs;
import gestionevenements.odcEvents.Service.UtilisateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


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



    @PostMapping("/logout")
    public void logout(@RequestBody Utilisateurs utilisateur) {
        utilisateursService.logout(utilisateur);
    }


    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody Utilisateurs utilisateurs, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
// Parcourez la liste des erreurs de validation
            for (FieldError error : bindingResult.getFieldErrors()) {
// Vérifiez si l'erreur concerne le champ mot de passe
                if (error.getField().equals("password")) {
                    return ResponseEntity.badRequest().body("Le mot de passe doit contenir au moins une lettre majuscule et un caractère spécial");
                }
// Vérifiez si l'erreur concerne le champ email
                if (error.getField().equals("email")) {
                    return ResponseEntity.badRequest().body("L'adresse email n'est pas valide");
                }
            }
            return ResponseEntity.badRequest().body("Une erreur s'est produite lors de la validation de vos informations de connexion");
        } else {
// Traitement de l'objet Utilisateur valide
            return ResponseEntity.ok().build();
        }
    }




}







