package com.project.studyseller.data.dto;

import com.project.studyseller.data.entity.Document;
import com.project.studyseller.data.entity.Member;

import java.util.Date;

public class PayDto {
    private Member sellerSn;
    private Member buyerSn;
    private Document docSn;
    private Date payDate;

    public PayDto(Member sellerSn, Member buyerSn, Document docSn, Date payDate) {
        this.sellerSn = sellerSn;
        this.buyerSn = buyerSn;
        this.docSn = docSn;
        this.payDate = payDate;
    }

    public Member getSellerSn() {
        return sellerSn;
    }

    public Member getBuyerSn() {
        return buyerSn;
    }

    public Document getDocSn() {
        return docSn;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setSellerSn(Member sellerSn) {
        this.sellerSn = sellerSn;
    }

    public void setBuyerSn(Member buyerSn) {
        this.buyerSn = buyerSn;
    }

    public void setDocSn(Document docSn) {
        this.docSn = docSn;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}