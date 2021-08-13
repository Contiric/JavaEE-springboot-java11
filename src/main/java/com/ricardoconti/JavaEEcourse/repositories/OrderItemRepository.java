package com.ricardoconti.JavaEEcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoconti.JavaEEcourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
	
}
