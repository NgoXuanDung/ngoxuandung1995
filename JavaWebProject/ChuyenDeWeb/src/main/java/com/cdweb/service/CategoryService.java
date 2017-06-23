package com.cdweb.service;

import java.util.List;

import com.cdweb.domain.Category;

public interface CategoryService {
	List<Category> findAll();

	Category findOne(int id);

	Category findOne(String name);

	int count();

	void create(Category category);

	void update(Category category);

	void delete(Category category);
}
