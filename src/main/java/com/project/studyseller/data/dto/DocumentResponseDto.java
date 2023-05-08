package com.project.studyseller.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class DocumentResponseDto {
    private Long DocSN;
    private String DocTitle;
    private int price;
    private int category;
    private String DocDetail;
    private String DocContent;
    private boolean DocPrivate;
    private boolean DocSellPrice;

    public DocumentResponseDto() {}


}
