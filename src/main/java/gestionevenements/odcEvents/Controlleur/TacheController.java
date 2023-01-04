package gestionevenements.odcEvents.Controlleur;

import gestionevenements.odcEvents.Model.Tache;
import gestionevenements.odcEvents.Service.TacheService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/taches")
public class TacheController {

    private TacheService tacheService;

    public TacheController(TacheService tacheService) {
        this.tacheService = tacheService;
    }

    @PostMapping
    public Tache addTache(@RequestBody Tache tache) {
        return tacheService.addTache(tache);
    }

    @PutMapping
    public Tache updateTache(@RequestBody Tache tache) {
        return tacheService.updateTache(tache);
    }

    @DeleteMapping("/{idTache}")
    public void deleteTache(@PathVariable Long idTache) {
        tacheService.deleteTache(idTache);
    }

    @GetMapping
    public List<Tache> getAllTaches() {
        return tacheService.getAllTaches();
    }

    @GetMapping("/{idTache}")
    public Tache getTacheById(@PathVariable Long idTache) {
        return tacheService.getTacheById(idTache);
    }

    @PutMapping("/assigner/{idTache}/{idUser}")
    public void assignerTache(@PathVariable Long idTache, @PathVariable Long idUser) {
        tacheService.assignerTache(idTache, idUser);
    }

    @PutMapping("/modifierDate/{idTache}")
    public void modifierDate(@PathVariable Long idTache, @RequestBody Date dateEcheance) {
        tacheService.modifierDate(idTache, dateEcheance);
    }
}

