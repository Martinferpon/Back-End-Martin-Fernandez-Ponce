
package com.portfolio.mafp.Security.Service;

import com.portfolio.mafp.Security.Entity.Usuario;
import com.portfolio.mafp.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImp implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
      Usuario usuario =usuarioService.getByNombreUsuario(nombreUsuario).get();
      return UsuarioPrincipal.build(usuario);
    }
    
}
