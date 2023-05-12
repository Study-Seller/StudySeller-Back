package com.project.studyseller.controller;

import com.project.studyseller.dto.ChangePayDateDto;
import com.project.studyseller.dto.PayDto;
import com.project.studyseller.dto.PayResponseDto;
import com.project.studyseller.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
@RequestMapping("/pay")
public class PayController {
//    private final PayService payService;

    @RequestMapping("/kakaopay.cls")
    @ResponseBody
    public String kakaopay() {
        try {
            URL url = new URL("https://kapi.kakao.com/v1/payment/ready");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();   //클라이언트가 전봇대1이고 카카오페이서버가 전봇대2면 이건 그 두개를 연결 시켜주는 전깃줄.(서버 연결)
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Authorization", "KakaoAK bb05538687f659b69c92681c736918cd");
            httpURLConnection.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
            httpURLConnection.setDoOutput(true);    //서버에게 전해줄 것의 유무, input은 기본값이 true라 안해줘도됨.

            String parameter = "cid=TC0ONETIME&" +
                    "partner_order_id=partner_order_id&" +
                    "partner_user_id=partner_user_id&" +
                    "item_name=StudySeller&" +
                    "quantity=1&" +
                    "total_amount=5000&" +
                    "tax_free_amount=450&" +
                    "approval_url=http://localhost:8085/pay/success&" +
                    "cancel_url=http://localhost:8085/pay/fail&" +
                    "fail_url=http://localhost:8085/pay/fail&";

            OutputStream outputStream = httpURLConnection.getOutputStream();    //줄 애
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream); //주는 애
            dataOutputStream.writeBytes(parameter);
            dataOutputStream.close();

            int result = httpURLConnection.getResponseCode();

            InputStream inputStream;    //받는 애
            if (result == 200) {
                inputStream = httpURLConnection.getInputStream();
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);   //읽는애
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);      //형변환하는애

            return bufferedReader.readLine();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "ㅎㅎ";
    }


    @GetMapping("/success")
    public String gg(){
        return "성공";
    }
    @GetMapping("/fail")
    public String hh(){
        return "실패";
    }
//    @Autowired
//    public PayController(PayService payService) {
//        this.payService = payService;
//    }
//
//    @GetMapping()
//    public ResponseEntity<PayResponseDto> getPay(Long paySn){
//        PayResponseDto payResponseDto = payService.getPay(paySn);
//
//        return ResponseEntity.status(HttpStatus.OK).body(payResponseDto);
//    }
//
//    @PostMapping()
//    public ResponseEntity<PayResponseDto> createPay(@RequestBody PayDto payDto){
//        PayResponseDto payResponseDto = payService.savePay(payDto);
//
//        return ResponseEntity.status(HttpStatus.OK).body(payResponseDto);
//    }
//
//    @PutMapping()
//    public ResponseEntity<PayResponseDto> changePayDate(
//            @RequestBody ChangePayDateDto changePayDateDto) throws Exception{
//        PayResponseDto payResponseDto = payService.changePayDate(
//                changePayDateDto.getPaySn(),
//                changePayDateDto.getPayDate());
//
//        return ResponseEntity.status(HttpStatus.OK).body(payResponseDto);
//    }
//
//    @DeleteMapping()
//    public ResponseEntity<String> deletePay(Long paySn) throws Exception{
//        payService.deletePay(paySn);
//
//        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
//    }
}
