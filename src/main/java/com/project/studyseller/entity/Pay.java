package com.project.studyseller.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Pay")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pay {
    @Id
    private Long paySn;         //결제코드(TID : 결제 한 건에 대한 고유번호)

    @ManyToOne
    @JoinColumn(name = "paySellerSn")
    private Member sellerSn;    //판매자

    @ManyToOne
    @JoinColumn(name = "payBuyerSn")
    private Member buyerSn;     //구매자

    @Column(nullable = false)
    private Date payMoney;      //결제금액

    @Column(nullable = false)
    private String payDoc;    //결제한 페이지 정보
}
