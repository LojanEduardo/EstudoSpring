package com.estudo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.curso.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{
	
	
	
}