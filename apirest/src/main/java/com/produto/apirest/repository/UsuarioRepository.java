package com.produto.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.apirest.models.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	void delete(Usuario usuario);
}
