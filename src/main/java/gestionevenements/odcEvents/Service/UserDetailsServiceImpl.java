package gestionevenements.odcEvents.Service;

import gestionevenements.odcEvents.Model.Utilisateurs;
import gestionevenements.odcEvents.Reposotory.UtilisateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UtilisateursRepository utilisateurRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Object> utilisateurOpt = utilisateurRepository.findByEmail(email);
        if (!utilisateurOpt.isPresent()) {
            throw new UsernameNotFoundException(email);
        }
        Utilisateurs utilisateur = (Utilisateurs) utilisateurOpt.get();
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(utilisateur.getRoles().toString()));
        return new User(utilisateur.getEmail(), utilisateur.getPassword(), authorities);
    }
}
