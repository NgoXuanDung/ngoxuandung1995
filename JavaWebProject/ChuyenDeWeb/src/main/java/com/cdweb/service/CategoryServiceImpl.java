package com.cdweb.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdweb.dao.CategoryDAO;
import com.cdweb.domain.Category;
import com.cdweb.util.StringUtil;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;
    
    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }
    
    @Override
    public Category findOne(int id) {
        return categoryDAO.findOne(id);
    }
    
    @Override
    public Category findOne(String name) {
        return categoryDAO.findOne(name);
    }
    
    @Override
    public int count() {
        return categoryDAO.count();
    }

    @Override
    public void create(Category category) {
    	category.setSlug(StringUtil.slugify(category.getName()));
        categoryDAO.create(category);
    }

    @Override
    public void update(Category category) {
    	category.setSlug(StringUtil.slugify(category.getName()));
        categoryDAO.update(category);
    }

    @Override
    public void delete(Category category) {
        categoryDAO.delete(category);
    }

}
