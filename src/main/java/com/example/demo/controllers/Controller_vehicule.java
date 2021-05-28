package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entities.Vehicule;
import com.example.demo.repositories.RepositoryConducteur;
import com.example.demo.repositories.RepositoryVehicule;

@Controller
public class Controller_vehicule {
	@Autowired RepositoryVehicule repositoryVehicule;
	//affichage du formulaire
//	@GetMapping("/form2")
//	public String afficher() {
//	    return "mes_vues/form_v";
//	}
	//soumettre mon formulaire
	@PostMapping("/form2")
	public String ajout(@Validated Vehicule vehicule, BindingResult bindingResult) {
     System.out.println(bindingResult);
			
			//En cas d'erreurs dans mon formulaire
			if(bindingResult.hasErrors()) {
				
				return "mes_vues/form_v";
			}
			repositoryVehicule.save(vehicule);
			
			return "mes_vues/form_v";
		}
	//Liste des vehicules 
	@GetMapping(value="/form2")
	public String liste(Model model) {
		
		//CRUD ---> R
		List<Vehicule>vehicul=repositoryVehicule.findAll();
		model.addAttribute("vehicules",vehicul);
		
		return "mes_vues/form_v";
		
	}
	}

