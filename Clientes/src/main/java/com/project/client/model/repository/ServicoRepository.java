package com.project.client.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.client.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
