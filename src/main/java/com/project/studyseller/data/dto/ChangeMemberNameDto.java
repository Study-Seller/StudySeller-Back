package com.project.studyseller.data.dto;

public class ChangeMemberNameDto {

    private Long userSn;
    private String userName;


    public ChangeMemberNameDto() {

    }

    public ChangeMemberNameDto(Long userSn, String userName) {
        this.userSn = userSn;
        this.userName = userName;
    }

    public Long getUserSn() {
        return userSn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserSn(Long userSn) {
        this.userSn = userSn;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
