package com.project.studyseller.service.impl;

import com.project.studyseller.data.dao.CategoryDAO;
import com.project.studyseller.data.dto.CategoryDto;
import com.project.studyseller.data.dto.CategoryResponseDto;
import com.project.studyseller.data.entity.Category;
import com.project.studyseller.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryDAO categoryDAO;

    @Autowired
    public CategoryServiceImpl(CategoryDAO categoryDAO) { this.categoryDAO = categoryDAO; }

    @Override
    public CategoryResponseDto getCategory(Long catSn) {
        Category category = categoryDAO.selectCategory(catSn);

        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        categoryResponseDto.setCatSn(category.getCatSn());
        categoryResponseDto.setCatName(category.getCatName());

        return categoryResponseDto;
    }

    @Override
    public CategoryResponseDto saveCategory(CategoryDto categoryDto) {
        Category category = new Category();

        category.setCatSn(categoryDto.getCatSn());
        category.setCatName(categoryDto.getCatName());

        Category savedCategory = categoryDAO.insertCategory(category);

        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        categoryResponseDto.setCatSn(savedCategory.getCatSn());
        categoryResponseDto.setCatName(savedCategory.getCatName());

        return categoryResponseDto;
    }

    @Override
    public CategoryResponseDto changeCategoryName(Long catSn, String catName) throws Exception {
        Category changedCategory = categoryDAO.updateCategoryName(catSn, catName);

        CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
        categoryResponseDto.setCatSn(changedCategory.getCatSn());
        categoryResponseDto.setCatName(changedCategory.getCatName());

        return categoryResponseDto;
    }

    @Override
    public void deleteCategory(Long catSn) throws Exception {
        categoryDAO.deleteCategory(catSn);
    }
}
