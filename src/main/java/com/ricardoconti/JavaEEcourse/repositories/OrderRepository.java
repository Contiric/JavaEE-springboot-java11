package com.ricardoconti.JavaEEcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoconti.JavaEEcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
