package com.project.studyseller.dto;

import com.project.studyseller.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class MemberDto {

    private String userId;
    private String userPw;
    private String userName;
    private String userIntroduce;
    private String twitterId;
    private String youtubeId;
    private String notionId;
    private String snsId;

    public Member toEntity(){
        return new Member(null, userId, userPw, userName, null, null, null, null);
    }
}
