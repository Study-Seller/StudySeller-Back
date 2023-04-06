package com.project.studyseller.data.dto;

public class ChangeDocTitleDto {

    private Long DocSN;
    private String DocTitle;

    public ChangeDocTitleDto(Long DocSN, String DocTitle) {
        this.DocSN = DocSN;
        this.DocTitle = DocTitle;
    }

    public ChangeDocTitleDto() {
    }

    public Long getDocSN() {
        return this.DocSN;
    }

    public void setDocSN(Long docSN) {
        this.DocSN = docSN;
    }

    public String getDocTitle() {
       return this.DocTitle;
    }

    public void setDocTitle(String docTitle) {
        this.DocTitle = docTitle;
    }

}
