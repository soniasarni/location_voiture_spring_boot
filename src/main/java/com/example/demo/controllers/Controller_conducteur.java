package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Conducteur;
import com.example.demo.entities.Vehicule;
import com.example.demo.repositories.RepositoryConducteur;

@Controller
public class Controller_conducteur {
@Autowired RepositoryConducteur repositoryConducteur;
//affichage du formulaire
@GetMapping("/form1")
public String ecran_conducteur() {
    return "mes_vues/form_c";
}
//ajouter des conducteurs dans db
@PostMapping("/form1")
public String ecran_conducteur(@Validated Conducteur conducteur, BindingResult bindingResult) {
    System.out.println(bindingResult);
	
			//En cas d'erreurs dans mon formulaire
			if(bindingResult.hasErrors()) {
				
				return "mes_vues/form_c";
			}
			repositoryConducteur.save(conducteur);
			
			return "mes_vues/form_c";
		}
////afficher la liste des conducteur
//@GetMapping("/form1")
//public String lister_conducteur(Model model) {
//	List<Conducteur>conduct=repositoryConducteur.findAll();
//	model.addAttribute("conducteurs", conduct);
//	return conducteurs;
//}
}
