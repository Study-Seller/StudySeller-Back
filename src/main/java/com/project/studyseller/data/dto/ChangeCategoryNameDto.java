package com.project.studyseller.data.dto;

public class ChangeCategoryNameDto {

    private Long catSn;
    private String catName;


    public ChangeCategoryNameDto() {

    }

    public ChangeCategoryNameDto(Long catSn, String catName) {
        this.catSn = catSn;
        this.catName = catName;
    }

    public Long getCatSn() {
        return catSn;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatSn(Long catSn) {
        this.catSn = catSn;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
