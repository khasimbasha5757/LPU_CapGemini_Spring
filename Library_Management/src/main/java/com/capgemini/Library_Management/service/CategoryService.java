package com.capgemini.Library_Management.service;


import java.util.List;
import java.util.Locale.Category;

public interface CategoryService {

    Category addCategory(Category category);

    Category getCategoryById(Long id);

    List<Category> getAllCategories();

    Category updateCategory(Long id, Category category);

    void deleteCategory(Long id);
}