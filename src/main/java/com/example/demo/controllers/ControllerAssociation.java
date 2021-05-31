package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Conducteur;
import com.example.demo.entities.Vehicule;
import com.example.demo.repositories.RepositoryAssociation;
import com.example.demo.repositories.RepositoryConducteur;

@Controller
public class ControllerAssociation<Vehicule_conducteurs> {
	RepositoryAssociation repositoryAssociation;
//	 RepositoryConducteur repositoryConducteur;
@GetMapping("/association")
public String association() {
return ("mes_vues/association");
}
//@PostMapping("/ajoutAssociation")
//public String ajouter(@Validated  Vehicule_conducteurs vehicule_conducteurs, BindingResult bindingResult) {
//repositoryAssociation.saveAll(vehicule_conducteurs);
//return "mes_vues/association" ;
//	
//}
}
