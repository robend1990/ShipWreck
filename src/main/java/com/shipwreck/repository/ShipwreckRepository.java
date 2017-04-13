package com.shipwreck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shipwreck.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{
	
}
