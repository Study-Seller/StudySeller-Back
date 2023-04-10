package com.project.studyseller.data.dto;

import com.project.studyseller.data.entity.Document;

public class DocFileDto {
    private Document docSn;
    private String fileLink;

    public DocFileDto(Document docSn, String fileLink) {
        this.docSn = docSn;
        this.fileLink = fileLink;
    }

    public Document getDocSn() {
        return docSn;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setDocSn(Document docSn) {
        this.docSn = docSn;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
}
