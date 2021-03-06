package com.example.demo.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vehicule {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_vehicule;

@Column(name="marque",length=30)
private String marque;
@Column(name="modele",length=30)
private String modele;
@Column(name="couleur",length=30)
private String couleur;
@Column(name="immatriculation",length=30)
private String immatriculation;

@OneToMany(fetch=FetchType.EAGER)
private Collection<Conducteur>conducteurs=new ArrayList<>();


public Vehicule() {
	super();
	// TODO Auto-generated constructor stub
}

public Vehicule(String marque, String modele, String couleur, String immatriculation) {
	super();
	this.marque = marque;
	this.modele = modele;
	this.couleur = couleur;
	this.immatriculation = immatriculation;
}
public Long getId_vehicule() {
	return id_vehicule;
}
public void setId_vehicule(Long id_vehicule) {
	this.id_vehicule = id_vehicule;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getModele() {
	return modele;
}
public void setModele(String modele) {
	this.modele = modele;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public String getImmatriculation() {
	return immatriculation;
}
public void setImmatriculation(String immatriculation) {
	this.immatriculation = immatriculation;
}
@Override
public String toString() {
	return "Vehicule [id_vehicule=" + id_vehicule + ", marque=" + marque + ", modele=" + modele + ", couleur=" + couleur
			+ ", immatriculation=" + immatriculation + "]";
}

}
