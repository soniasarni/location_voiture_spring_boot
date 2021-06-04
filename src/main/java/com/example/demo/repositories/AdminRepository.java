package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Association;

public interface AdminRepository extends JpaRepository<Association,Long>{
	
	@Query(value="SELECT count(*) FROM conducteur c WHERE id_conducteur NOT IN (SELECT conducteur1_id_conducteur FROM Association)", nativeQuery = true)
	Long conducteurSansVehicule();
	
//	@Query(value="SELECT count(*) FROM vehicule v WHERE id_vehicule NOT  IN (SELECT vehicule1_id_vehicule FROM association )", nativeQuery = true)
//	Long vehiculeSansConducteur();
}
