package com.daniel.azshop.catalog.repository;

import com.daniel.azshop.catalog.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
