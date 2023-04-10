package com.project.studyseller.data.dto;

import com.project.studyseller.data.entity.Document;

public class DocFileResponseDto {

    private Long fileSn;
    private Document docSn;
    private String fileLink;

    public DocFileResponseDto(){}

    public DocFileResponseDto(Long fileSn, Document docSn, String fileLink) {
        this.fileSn = fileSn;
        this.docSn = docSn;
        this.fileLink = fileLink;
    }

    public Long getFileSn() {
        return fileSn;
    }

    public Document getDocSn() {
        return docSn;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileSn(Long fileSn) {
        this.fileSn = fileSn;
    }

    public void setDocSn(Document docSn) {
        this.docSn = docSn;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
}
