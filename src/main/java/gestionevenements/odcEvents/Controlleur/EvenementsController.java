package gestionevenements.odcEvents.Controlleur;

import gestionevenements.odcEvents.Model.Evenements;
import gestionevenements.odcEvents.Service.EvenementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evenements")
public class EvenementsController {

    private EvenementsService evenementsService;

    @PostMapping("/add")
    public Evenements addEvenement(@RequestBody Evenements evenement) {
        return evenementsService.addEvenement(evenement);
    }

    @PutMapping("/update")
    public Evenements updateEvenement(@RequestBody Evenements evenement) {
        return evenementsService.updateEvenement(evenement);
    }

    @DeleteMapping("/delete/{idEvenement}")
    public void deleteEvenement(@PathVariable Long idEvenement) {
        evenementsService.deleteEvenement(idEvenement);
    }

    @GetMapping("/all")
    public List<Evenements> getAllEvenements() {
        return evenementsService.getAllEvenements();
    }

    @GetMapping("/{idEvenement}")
    public Evenements getEvenementById(@PathVariable Long idEvenement) {
        return evenementsService.getEvenementById(idEvenement);
    }
}

