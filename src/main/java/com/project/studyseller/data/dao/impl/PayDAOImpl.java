package com.project.studyseller.data.dao.impl;

import com.project.studyseller.data.dao.PayDAO;
import com.project.studyseller.data.entity.Pay;
import com.project.studyseller.data.repository.PayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

import java.util.Date;
import java.util.Optional;

@Component
public class PayDAOImpl implements PayDAO {

    private final PayRepository payRepository;

    @Autowired
    public PayDAOImpl(PayRepository payRepository){
        this.payRepository = payRepository;
    }

    @Override
    public Pay insertPay(Pay pay) {
        Pay savedPay = payRepository.save(pay);

        return savedPay;
    }

    @Override
    public Pay selectPay(Long paySn) {
        Pay selectedPay = payRepository.getById(paySn);
        return selectedPay;
    }

    @Override
    public Pay updatePayDate(Long paySn, Date payDate) throws Exception{
        Optional<Pay> selectedPay = payRepository.findById(paySn);

        Pay updatedPay;
        if(selectedPay.isPresent()){
            Pay pay = selectedPay.get();

            pay.setPayDate(payDate);

            updatedPay = payRepository.save(pay);
        }else{
            throw new Exception();
        }
        return updatedPay;
    }

    @Override
    public void deletePay(Long paySn) throws Exception {
        Optional<Pay> selectedPay = payRepository.findById(paySn);

        if(selectedPay.isPresent()){
            Pay pay = selectedPay.get();

            payRepository.delete(pay);
        }else{
            throw new Exception();
        }
    }
}
