package com.project.studyseller.data.dto;

import com.project.studyseller.data.entity.Document;
import com.project.studyseller.data.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class PayDto {
    private Member sellerSn;
    private Member buyerSn;
    private Document docSn;
    private Date payDate;

}