package com.project.studyseller.service.impl;

import com.project.studyseller.data.dao.PayDAO;
import com.project.studyseller.data.dto.PayDto;
import com.project.studyseller.data.dto.PayResponseDto;
import com.project.studyseller.data.entity.Pay;
import com.project.studyseller.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PayServiceImpl implements PayService {

    private final PayDAO payDAO;

    @Autowired
    public PayServiceImpl(PayDAO payDAO) {
        this.payDAO = payDAO;
    }

    @Override
    public PayResponseDto getPay(Long paySn) {
        Pay pay = payDAO.selectPay(paySn);

        PayResponseDto payResponseDto = new PayResponseDto();
        payResponseDto.setPaySn(pay.getPaySn());
        payResponseDto.setSellerSn(pay.getSellerSn());
        payResponseDto.setBuyerSn(pay.getBuyerSn());
        payResponseDto.setDocSn(pay.getDocSn());
        payResponseDto.setPayDate(pay.getPayDate());

        return payResponseDto;
    }

    @Override
    public PayResponseDto savePay(PayDto payDto) {
        Pay pay = new Pay();
        pay.setSellerSn(payDto.getSellerSn());
        pay.setBuyerSn(payDto.getBuyerSn());
        pay.setDocSn(payDto.getDocSn());
        pay.setPayDate(payDto.getPayDate());

        Pay savedPay = payDAO.insertPay(pay);

        PayResponseDto payResponseDto = new PayResponseDto();
        payResponseDto.setPaySn(savedPay.getPaySn());
        payResponseDto.setSellerSn(savedPay.getSellerSn());
        payResponseDto.setBuyerSn(savedPay.getBuyerSn());
        payResponseDto.setDocSn(savedPay.getDocSn());
        payResponseDto.setPayDate(savedPay.getPayDate());

        return payResponseDto;
    }

    @Override
    public PayResponseDto changePayDate(Long paySn, Date payDate) throws Exception {
        Pay changedPay = payDAO.updatePayDate(paySn, payDate);

        PayResponseDto payResponseDto = new PayResponseDto();
        payResponseDto.setPaySn(changedPay.getPaySn());
        payResponseDto.setSellerSn(changedPay.getSellerSn());
        payResponseDto.setBuyerSn(changedPay.getBuyerSn());
        payResponseDto.setDocSn(changedPay.getDocSn());
        payResponseDto.setPayDate(changedPay.getPayDate());

        return payResponseDto;
    }

    @Override
    public void deletePay(Long paySn) throws Exception {
        payDAO.deletePay(paySn);
    }
}
