package com.project.studyseller.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class ChangeDocFileLinkDto {

    private Long fileSn;
    private String fileLink;

    public ChangeDocFileLinkDto(){}

}