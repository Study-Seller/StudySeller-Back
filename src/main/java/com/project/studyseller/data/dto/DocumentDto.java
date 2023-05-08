package com.project.studyseller.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class DocumentDto {
    private String DocTitle;
    private String DocContent;
    private int price;
    private int category;
    private String DocDetail;
    private boolean DocPrivate;
    private boolean DocSellPrice;

    public DocumentDto(String DocTitle, String DocContent, int price, int category, String DocDetail, boolean DocPrivate, boolean DocSellPrice){
        this.DocTitle = DocTitle;
        this.DocContent = DocContent;
        this.DocDetail = DocDetail;
        this.price = price;
        this.category = category;
        this.DocPrivate = DocPrivate;
        this.DocSellPrice = DocSellPrice;

    }


}
