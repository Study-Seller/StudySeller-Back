// 데이터베이스의 테이블과 구조 생성

package com.project.studyseller.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Member")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //JPA 구현체가
    private Long userSn;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String userPw;

    @Column()
    private String userName;

    @Column()
    private String twitterId;
    @Column()
    private String youtubeId;
    @Column()
    private String notionId;
    @Column()
    private String snsId;


}
