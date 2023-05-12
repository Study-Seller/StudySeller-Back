package com.project.studyseller.service;

import com.project.studyseller.dto.PayDto;
import com.project.studyseller.dto.PayResponseDto;

import java.util.Date;

public interface PayService {
    PayResponseDto getPay(Long paySn);

    PayResponseDto savePay(PayDto payDto);

    PayResponseDto changePayDate(Long paySn, Date payDate) throws Exception;

    void deletePay(Long paySn) throws Exception;
}
