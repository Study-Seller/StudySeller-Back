package com.project.studyseller.data.dto;

public class CategoryDto {

    private String catName;

    public CategoryDto(String catName) {
        this.catName = catName;
    }


    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
