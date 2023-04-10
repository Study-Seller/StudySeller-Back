package com.project.studyseller.data.entity;

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
    private Member sellerSn;

    @ManyToOne
    @JoinColumn(name = "payBuyerSn")
    private Member buyerSn;

    @ManyToOne
    @JoinColumn(name = "payDocSn")
    private Document docSn;

    @Column(nullable = false)
    private Date payDate;
}
