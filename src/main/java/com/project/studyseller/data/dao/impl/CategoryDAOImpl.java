package com.project.studyseller.data.dao.impl;

import com.project.studyseller.data.dao.CategoryDAO;
import com.project.studyseller.data.entity.Category;
import com.project.studyseller.data.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CategoryDAOImpl implements CategoryDAO {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryDAOImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category insertCategory(Category category){
        Category savedCategory = categoryRepository.save(category);
        return savedCategory;
    }

    @Override
    public Category selectCategory(Long catSn) {
        Category selectedCategory = categoryRepository.getById(catSn);
        return selectedCategory;
    }

    @Override
    public Category updateCategoryName(Long catSn, String catName) throws Exception {
        Optional<Category> selectedCategory = categoryRepository.findById(catSn);

        Category updatedCategory;
        if(selectedCategory.isPresent()){
            Category category = selectedCategory.get();

            category.setCatName(catName);

            updatedCategory = categoryRepository.save(category);
        }else{
            throw new Exception();
        }

        return updatedCategory;
    }

    @Override
    public void deleteCategory(Long catSn) throws Exception{
        Optional<Category> selectedCategory = categoryRepository.findById(catSn);   //findById() 메서드를 통해 객체를 가져오는 작업 수행

        if(selectedCategory.isPresent()){
            Category category = selectedCategory.get();

            categoryRepository.delete(category);    //delete()메서드를 통해 해당 객체를 삭제하게끔 삭제 요청
        }else{
            throw new Exception();
        }
    }
}
