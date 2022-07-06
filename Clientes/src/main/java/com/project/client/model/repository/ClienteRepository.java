package com.project.client.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.client.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	
}
