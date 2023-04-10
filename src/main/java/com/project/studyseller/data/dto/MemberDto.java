package com.project.studyseller.data.dto;

public class MemberDto {

    private Long userSn;
    private String userId;
    private String userPw;
    private String userName;
    private String userIntroduce;

    public MemberDto(Long userSn, String userId, String userPw, String userName, String userIntroduce) {
        this.userSn = userSn;
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
    public Long getUserSn() {
        return userSn;
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

    public void setUserSn(Long userSn) {
        this.userSn = userSn;
    }
}
