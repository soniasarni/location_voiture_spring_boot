package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Conducteur;
import com.example.demo.entities.Vehicule;

public interface RepositoryAssociation extends JpaRepository<Conducteur,Vehicule>{

	//void saveAll(Vehicule_conducteurs vehicule_conducteurs);
//Conducteur saveConducteur(Conducteur conducteur);
//Vehicule saveVehicule(Vehicule vehicule);
//void addVehiculeToConducteur(String marque,Long id_conducteur);
//Conducteur findById(Long id_conducteur);
}
