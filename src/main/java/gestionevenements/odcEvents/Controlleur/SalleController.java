package gestionevenements.odcEvents.Controlleur;

import gestionevenements.odcEvents.Model.Salles;
import gestionevenements.odcEvents.Service.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salles")
public class SalleController {

    @Autowired
    SalleService salleService;

    @PostMapping
    public Salles create(@RequestBody Salles salle) {
        return salleService.create(salle);
    }

    @GetMapping
    public List<Salles> getAll() {
        return salleService.getAll();
    }

    @GetMapping("/{id}")
    public Salles read(@PathVariable long id) {
        return salleService.read(id);
    }

    @PutMapping("/{id}")
    public Salles update(@RequestBody Salles salle, @PathVariable long id) {
        return salleService.update(salle, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        salleService.delete(id);
    }

    @GetMapping("/libelle/{libelle}")
    public Salles getByLibelle(@PathVariable String libelle) {
        return salleService.getByLibelle(libelle);
    }

    @GetMapping("/idsalle/{id}")
    public Salles getByIdsalle(@PathVariable long id) {
        return salleService.getByIdsalle(id);
    }

    @GetMapping("/disponibilite/{disponibilite}")
    public List<Salles> ParEtat(@PathVariable boolean disponibilite) {
        return salleService.ParEtat(disponibilite);
    }
}
