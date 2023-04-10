package com.project.studyseller.data.dto;

import java.util.Date;

public class ChangePayDateDto {

    private Long paySn;
    private Date payDate;

    public ChangePayDateDto(Long paySn, Date payDate) {
        this.paySn = paySn;
        this.payDate = payDate;
    }
    public ChangePayDateDto(){
    }

    public Long getPaySn() {
        return paySn;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPaySn(Long paySn) {
        this.paySn = paySn;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}
