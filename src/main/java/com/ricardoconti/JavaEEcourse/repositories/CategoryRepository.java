package com.ricardoconti.JavaEEcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoconti.JavaEEcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
