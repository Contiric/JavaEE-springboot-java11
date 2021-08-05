package com.ricardoconti.JavaEEcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoconti.JavaEEcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
