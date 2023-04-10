package com.project.studyseller.data.dao;

import com.project.studyseller.data.entity.Category;

public interface CategoryDAO {
    Category insertCategory(Category category);

    Category selectCategory(Long catSn);

    Category updateCategoryName(Long catSn, String catName) throws Exception;

    void deleteCategory(Long catSn) throws Exception;
}
