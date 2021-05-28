package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Conducteur;

public interface RepositoryConducteur extends JpaRepository<Conducteur,Long> {

}
