package com.team36.webProg.Repository;

import com.team36.webProg.model.Category;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	public List<Category> findByNameContainingIgnoreCase(String name);
}
