package com.project.studyseller.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class ChangeCategoryNameDto {

    private Long catSn;
    private String catName;


    public ChangeCategoryNameDto() {

    }
}
