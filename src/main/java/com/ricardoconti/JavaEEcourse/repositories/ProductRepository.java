package com.ricardoconti.JavaEEcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoconti.JavaEEcourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
