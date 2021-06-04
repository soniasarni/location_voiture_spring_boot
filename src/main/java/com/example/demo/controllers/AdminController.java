package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repositories.AdminRepository;
import com.example.demo.repositories.RepositoryAssociation;
import com.example.demo.repositories.RepositoryConducteur;
import com.example.demo.repositories.RepositoryVehicule;


@Controller
public class AdminController {

	@Autowired RepositoryConducteur repositoryConducteur ;
	@Autowired RepositoryVehicule repositoryVehicule;
	@Autowired RepositoryAssociation repositoryAssociation;
	@Autowired AdminRepository adminRepo;
	
	@GetMapping("/admin")
	public String admin(Model model) {
		
		model.addAttribute("nbreConducteurs", repositoryConducteur.count());
		model.addAttribute("nbreVehicules", repositoryVehicule.count());
		model.addAttribute("nbreAsso",  repositoryAssociation.count());
		
	   model.addAttribute("CLibre", adminRepo.conducteurSansVehicule());
	//model.addAttribute("VLibre", adminRepo.vehiculeSansConducteur());
		
		
		return "mes_vues/admin";
	}
}
