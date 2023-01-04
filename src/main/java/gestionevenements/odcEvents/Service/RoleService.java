package gestionevenements.odcEvents.Service;


import gestionevenements.odcEvents.Model.Role;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RoleService {
    Role addRole(Role role);
    Role updateRole(Role role);
    String deleteRole(Long idRole);
    List<Role> getAllRoles();
    Role getRoleById(Long idRole);

}
