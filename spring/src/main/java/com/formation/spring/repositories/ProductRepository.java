package com.formation.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.formation.spring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
