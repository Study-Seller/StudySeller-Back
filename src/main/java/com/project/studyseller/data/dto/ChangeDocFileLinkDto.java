package com.project.studyseller.data.dto;

public class ChangeDocFileLinkDto {

    private Long fileSn;
    private String fileLink;

    public ChangeDocFileLinkDto(Long fileSn, String fileLink) {
        this.fileSn = fileSn;
        this.fileLink = fileLink;
    }

    public ChangeDocFileLinkDto(){}

    public Long getFileSn() {
        return fileSn;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileSn(Long fileSn) {
        this.fileSn = fileSn;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
}
