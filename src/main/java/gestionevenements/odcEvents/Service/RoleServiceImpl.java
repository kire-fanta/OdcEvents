package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.Role;
import gestionevenements.odcEvents.Reposotory.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService{
    private RoleRepository RP;
    @Override
    public Role addRole(Role role) {
        return  RP.save(role);
    }

    @Override

    public Role updateRole(Role role) {
        Role updatedRole = RP.findById(role.getIdRole()).orElse(null);
        if (updatedRole != null) {
            updatedRole.setNomRole(role.getNomRole());
            RP.save(updatedRole);
            return updatedRole;
        } else {
            return null;
        }

    }

    @Override
    public String deleteRole(Long idRole) {
RP.deleteById(idRole);
return"Role supprimé avec succes ";
    }

    @Override
    public List<Role> getAllRoles() {
        return RP.findAll();
    }

    @Override
    public Role getRoleById(Long idRole) {
        return RP.findById(idRole).orElse(null);
    }
}
