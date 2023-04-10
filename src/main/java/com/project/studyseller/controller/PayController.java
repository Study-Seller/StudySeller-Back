package com.project.studyseller.controller;

import com.project.studyseller.data.dto.ChangePayDateDto;
import com.project.studyseller.data.dto.PayDto;
import com.project.studyseller.data.dto.PayResponseDto;
import com.project.studyseller.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pay")
public class PayController {
    private final PayService payService;

    @Autowired
    public PayController(PayService payService) {
        this.payService = payService;
    }

    @GetMapping()
    public ResponseEntity<PayResponseDto> getPay(Long paySn){
        PayResponseDto payResponseDto = payService.getPay(paySn);

        return ResponseEntity.status(HttpStatus.OK).body(payResponseDto);
    }

    @PostMapping()
    public ResponseEntity<PayResponseDto> createPay(@RequestBody PayDto payDto){
        PayResponseDto payResponseDto = payService.savePay(payDto);

        return ResponseEntity.status(HttpStatus.OK).body(payResponseDto);
    }

    @PutMapping()
    public ResponseEntity<PayResponseDto> changePayDate(
            @RequestBody ChangePayDateDto changePayDateDto) throws Exception{
        PayResponseDto payResponseDto = payService.changePayDate(
                changePayDateDto.getPaySn(),
                changePayDateDto.getPayDate());

        return ResponseEntity.status(HttpStatus.OK).body(payResponseDto);
    }

    @DeleteMapping()
    public ResponseEntity<String> deletePay(Long paySn) throws Exception{
        payService.deletePay(paySn);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}
