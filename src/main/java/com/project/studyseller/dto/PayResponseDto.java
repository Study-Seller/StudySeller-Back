package com.project.studyseller.dto;

import com.project.studyseller.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
public class PayResponseDto {

    private Long paySn;
    private Member sellerSn;    //판매자

    private Member buyerSn;     //구매자

    private Date payMoney;      //결제금액

    private String payDoc;    //결제한 페이지 정보

    public PayResponseDto() {}

}
