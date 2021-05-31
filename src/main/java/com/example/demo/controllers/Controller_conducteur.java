package com.example.demo.controllers;



import java.util.List;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Conducteur;
import com.example.demo.entities.Vehicule;
import com.example.demo.repositories.RepositoryConducteur;

@Controller
public class Controller_conducteur {
@Autowired RepositoryConducteur repositoryConducteur;
//affichage du formulaire
//@GetMapping("/form1")
//public String ecran_conducteur() {
//    return "mes_vues/form_c";
//}
//ajouter des conducteurs dans db
@PostMapping("/form1")
public String ecran_conducteur(@Validated Conducteur conducteur, BindingResult bindingResult) {
	//En cas d'erreurs dans mon formulaire
			if(bindingResult.hasErrors()) {
				return "mes_vues/form_c";
			}
			repositoryConducteur.save(conducteur);
			
			return "mes_vues/form_c";
		}
////afficher la liste des conducteur
@GetMapping("/form1")
public String listeC(Model model) {
	List<Conducteur>conduct=repositoryConducteur.findAll();
	model.addAttribute("conducteurs", conduct);
	return "mes_vues/form_c";
}
//chercher un conducteur
//@GetMapping("/index")
//public void index(Model model,String mc) {
//	
//	List<Conducteur>conduct1=repositoryConducteur.chercher("%"+mc+"%");
//}
//DELETE CONDUCTEUR
@GetMapping("/index/{id}")
public String delete (@PathVariable(value = "id") Long id_conducteur) throws AttributeNotFoundException {
	
	Conducteur Conducteur = repositoryConducteur.findById(id_conducteur).orElseThrow(() -> new AttributeNotFoundException("Id non trouvÃ© " +id_conducteur)) ;
	
	//employeRepository.delete(employe);
	repositoryConducteur.deleteById(id_conducteur);
	
	return "mes_vues/form_c";
}
}
