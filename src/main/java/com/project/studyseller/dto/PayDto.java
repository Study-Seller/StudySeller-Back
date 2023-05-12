package com.project.studyseller.dto;

import com.project.studyseller.entity.Member;
import com.project.studyseller.entity.Pay;
import jakarta.persistence.Column;
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
    private int payMoney;      //결제금액
    private String payDoc;    //결제한 페이지 정보

    public Pay toEntity() {
        return new Pay(null, sellerSn, buyerSn, payMoney, payDoc);
    }
}