package com.project.studyseller.service;

import com.project.studyseller.data.dto.CategoryDto;
import com.project.studyseller.data.dto.CategoryResponseDto;

public interface CategoryService {
    CategoryResponseDto getCategory(Long catSn);

    CategoryResponseDto saveCategory(CategoryDto categoryDto);

    CategoryResponseDto changeCategoryName(Long catSn, String catName) throws Exception;

    void deleteCategory(Long catSn) throws Exception;

}
