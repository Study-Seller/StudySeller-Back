package com.project.studyseller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class ChangeMemberNameDto {

    private Long userSn;
    private String userName;


    public ChangeMemberNameDto() {

    }

}
