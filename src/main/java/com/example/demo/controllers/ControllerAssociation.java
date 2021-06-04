package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Association;
import com.example.demo.repositories.RepositoryAssociation;
import com.example.demo.repositories.RepositoryConducteur;
import com.example.demo.repositories.RepositoryVehicule;

	
@Controller
public class ControllerAssociation {
	@Autowired RepositoryConducteur repositoryConducteur;
	@Autowired RepositoryVehicule repositoryVehicule;
	@Autowired RepositoryAssociation repositoryAssociation;
	
	//aficher la liste	    
@GetMapping("/association")	
public String asso(Model model) {
	model.addAttribute("conducteurs",repositoryConducteur.findAll());
	model.addAttribute("vehicules",repositoryVehicule.findAll());
	model.addAttribute("association",repositoryAssociation.findAll());
	return"mes_vues/association";
}
   //Ajouter des associations
@PostMapping("/associa")

public String ajout(@Validated Association associat, BindingResult bindingResult) {
    
			
		//En cas d'erreurs dans mon formulaire
		if(bindingResult.hasErrors()) {
			
			return "mes_vues/association";
		}
        repositoryAssociation.save(associat);
        return "redirect:/association";
}
}
