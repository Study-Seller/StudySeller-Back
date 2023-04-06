package com.project.studyseller.data.dto;

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

    public String getDocTitle() {
        return DocTitle;
    }

    public void setDocTitle(String docTitle) {
        this.DocTitle = docTitle;
    }

    public String getDocContent() {
        return DocContent;
    }

    public void setDocContent(String docContent) {
        this.DocContent = docContent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getDocDetail() {
        return DocDetail;
    }

    public void setDocDetail(String docDetail) {
        this.DocDetail = docDetail;
    }

    public boolean getDocPrivate() {
        return DocPrivate;
    }

    public void setDocPrivate(boolean docPrivate) {
        this.DocPrivate = docPrivate;
    }

    public boolean getDocSellPrice() {
        return DocSellPrice;
    }

    public void setDocSellPrice(boolean docSellPrice) {
        this.DocSellPrice = docSellPrice;
    }




}
