package com.project.studyseller.controller;

import com.project.studyseller.dto.PayDto;
import com.project.studyseller.dto.PayResponseDto;
import com.project.studyseller.entity.Pay;
import com.project.studyseller.repository.PayRepository;
import com.project.studyseller.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pay")
public class PayController {

    @Autowired
    PayService payService;

    @Autowired
    PayRepository payRepository;

    @PostMapping("/kakaopay")
    public List<String> kakaopay(@RequestBody PayResponseDto payResponseDto) {
        List<String> kakaopay = payService.kakaopay(payResponseDto);
        return kakaopay;
    }

    @GetMapping("/success")
    public String success(@RequestBody PayDto payDto){
//        Pay pay = payDto.toEntity();
//        payService.savePay(pay);
        return "성공";
    }
    @GetMapping("/fail")
    public String hh(){
        return "실패";
    }

}
