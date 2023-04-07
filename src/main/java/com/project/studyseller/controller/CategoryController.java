package com.project.studyseller.controller;

import com.project.studyseller.data.dto.CategoryDto;
import com.project.studyseller.data.dto.CategoryResponseDto;
import com.project.studyseller.data.dto.ChangeCategoryNameDto;
import com.project.studyseller.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping()
    public ResponseEntity<CategoryResponseDto> getCategory(Long catSn){
        CategoryResponseDto categoryResponseDto = categoryService.getCategory(catSn);

        return ResponseEntity.status(HttpStatus.OK).body(categoryResponseDto);
    }

    @PostMapping()
    public ResponseEntity<CategoryResponseDto> createCategory(@RequestBody CategoryDto categoryDto){
        CategoryResponseDto categoryResponseDto = categoryService.saveCategory(categoryDto);

        return ResponseEntity.status(HttpStatus.OK).body(categoryResponseDto);
    }
    @PutMapping()
    public ResponseEntity<CategoryResponseDto> changeCategoryName(
            @RequestBody ChangeCategoryNameDto changeMemberNameDto) throws Exception {

        CategoryResponseDto categoryResponseDto = categoryService.changeCategoryName(
                changeMemberNameDto.getCatSn(),
                changeMemberNameDto.getCatName());

        return ResponseEntity.status(HttpStatus.OK).body(categoryResponseDto);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteCategory(Long catSn) throws Exception{
        categoryService.deleteCategory(catSn);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}
