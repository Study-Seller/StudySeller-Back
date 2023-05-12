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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paySn;

    @ManyToOne
    @JoinColumn(name = "paySellerSn")
    private Member sellerSn;    //판매자

    @ManyToOne
    @JoinColumn(name = "payBuyerSn")
    private Member buyerSn;     //구매자

    @Column(nullable = false)
    private int payMoney;      //결제금액

    @Column(nullable = false)
    private String payDoc;    //결제한 페이지 정보
}
