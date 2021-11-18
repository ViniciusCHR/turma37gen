package org.generation.blog.Pessoal.repository;

import java.util.Optional;

import org.generation.blog.Pessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findbyUsuario(String usuario);

	public Optional<Usuario> findByUsuario(String usuario);
}
