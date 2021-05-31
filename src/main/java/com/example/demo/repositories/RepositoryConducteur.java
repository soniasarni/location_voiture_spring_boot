package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Conducteur;

public interface RepositoryConducteur extends JpaRepository<Conducteur,Long> {
//@Query("select list from Conducteur where nom like :x")
//	public List<Conducteur>chercher(@Param("x")String mc);
}
