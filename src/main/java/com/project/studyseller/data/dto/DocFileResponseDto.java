package com.project.studyseller.data.dto;

import com.project.studyseller.data.entity.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class DocFileResponseDto {

    private Long fileSn;
    private Document docSn;
    private String fileLink;

    public DocFileResponseDto(){}

}
