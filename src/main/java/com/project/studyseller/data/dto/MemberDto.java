package com.project.studyseller.data.dto;

public class MemberDto {

    private String userId;
    private String userPw;
    private String userName;
    private String userIntroduce;

    public MemberDto(String userId, String userPw, String userName, String userIntroduce) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userIntroduce = userIntroduce;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserIntroduce() {
        return userIntroduce;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserIntroduce(String userIntroduce) {
        this.userIntroduce = userIntroduce;
    }

}
