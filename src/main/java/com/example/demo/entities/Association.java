package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


	@Entity
	public class Association{

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		@ManyToOne
		private Conducteur conducteur1;
		
		@ManyToOne
		private Vehicule vehicule1;

		public Association() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Association(Long id, Conducteur conducteur1, Vehicule vehicule1) {
			super();
			this.id = id;
			this.conducteur1 = conducteur1;
			this.vehicule1 = vehicule1;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Conducteur getConducteur1() {
			return conducteur1;
		}

		public void setConducteur1(Conducteur conducteur1) {
			this.conducteur1 = conducteur1;
		}

		public Vehicule getVehicule1() {
			return vehicule1;
		}

		public void setVehicule1(Vehicule vehicule1) {
			this.vehicule1 = vehicule1;
		}

	}
