package com.project.studyseller.data.dao;

import com.project.studyseller.data.entity.Pay;

import java.util.Date;

public interface PayDAO {
    Pay insertPay(Pay pay);

    Pay selectPay(Long paySn);

    Pay updatePayDate(Long paySn, Date payDate) throws Exception;

    void deletePay(Long paySn) throws Exception;
}
