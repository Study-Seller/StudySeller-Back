package com.project.studyseller.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class MemberResonseDto {
    private Long userSN;
    private String userId;
    private String userPw;
    private String userName;
    private String userIntroduce;
    private String twitterId;
    private String youtubeId;
    private String notionId;
    private String snsId;

    public MemberResonseDto(){}

}
