package com.project.studyseller.data.dto;


public class MemberResonseDto {
    private Long userSN;
    private String userId;
    private String userPw;
    private String userName;
    private String userIntroduce;

    public MemberResonseDto(){}

    public MemberResonseDto(Long userSN, String userId, String userPw, String userName, String userIntroduce) {
        this.userSN = userSN;
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userIntroduce = userIntroduce;
    }

    public Long getUserSN() {
        return userSN;
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

    public void setUserSN(Long userSN) {
        this.userSN = userSN;
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
