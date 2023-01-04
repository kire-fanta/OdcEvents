package gestionevenements.odcEvents.Controlleur;
import gestionevenements.odcEvents.Model.Role;
import gestionevenements.odcEvents.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/add")
    public Role addRole(@RequestBody Role role) {
        return roleService.addRole(role);
    }

    @PutMapping("/update")
    public Role updateRole(@RequestBody Role role) {
        return roleService.updateRole(role);
    }

    @DeleteMapping("/delete/{idRole}")
    public String deleteRole(@PathVariable Long idRole) {
        return roleService.deleteRole(idRole);
    }

    @GetMapping("/all")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/{idRole}")
    public Role getRoleById(@PathVariable Long idRole) {
        return roleService.getRoleById(idRole);
    }
}

