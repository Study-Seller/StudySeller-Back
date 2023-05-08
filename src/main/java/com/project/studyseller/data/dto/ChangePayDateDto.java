package com.project.studyseller.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class ChangePayDateDto {

    private Long paySn;
    private Date payDate;

    public ChangePayDateDto(){
    }

}
