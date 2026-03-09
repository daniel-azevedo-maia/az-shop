package com.daniel.azshop.catalog.repository;

import com.daniel.azshop.catalog.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
