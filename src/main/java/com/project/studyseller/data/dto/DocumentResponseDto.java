package com.project.studyseller.data.dto;

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


    public DocumentResponseDto(Long DocSN, String DocTitle, String DocContent, int price, int category, String DocDetail, boolean DocPrivate, boolean DocSellPrice){
        this.DocSN = DocSN;
        this.DocTitle = DocTitle;
        this.DocContent = DocContent;
        this.DocDetail = DocDetail;
        this.price = price;
        this.category = category;
        this.DocPrivate = DocPrivate;
        this.DocSellPrice = DocSellPrice;
    }
    public Long getDocSN() {
        return DocSN;
    }
    public void setDocSN(Long docSN) {
        DocSN = docSN;
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

    public boolean isDocPrivate() {
        return DocPrivate;
    }

    public void setDocPrivate(boolean docPrivate) {
        this.DocPrivate = docPrivate;
    }

    public boolean isDocSellPrice() {
        return DocSellPrice;
    }

    public void setDocSellPrice(boolean docSellPrice) {
        this.DocSellPrice = docSellPrice;
    }

}
