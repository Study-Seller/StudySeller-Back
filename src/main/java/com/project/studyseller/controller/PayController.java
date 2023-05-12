package com.project.studyseller.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.studyseller.dto.ChangePayDateDto;
import com.project.studyseller.dto.KakaoResDto;
import com.project.studyseller.dto.PayDto;
import com.project.studyseller.dto.PayResponseDto;
import com.project.studyseller.entity.Pay;
import com.project.studyseller.repository.PayRepository;
import com.project.studyseller.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pay")
public class PayController {

    @Autowired
    PayRepository payRepository;

    @RequestMapping("/kakaopay.cls")
    @ResponseBody
    public String kakaopay(@RequestBody PayDto payDto) {

        try {
            URL url = new URL("https://kapi.kakao.com/v1/payment/ready");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();   //클라이언트가 전봇대1이고 카카오페이서버가 전봇대2면 이건 그 두개를 연결 시켜주는 전깃줄.(서버 연결)
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Authorization", "KakaoAK bb05538687f659b69c92681c736918cd");
            httpURLConnection.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
            httpURLConnection.setDoOutput(true);    //서버에게 전해줄 것의 유무, input은 기본값이 true라 안해줘도됨.

            Pay pay = payDto.toEntity();
            String payMoney = String.valueOf(payDto.getPayMoney());
            String payDoc = String.valueOf(payDto.getPayDoc());

            String parameter = "cid=TC0ONETIME&" +                      //가맹점 코드(10자)
                    "partner_order_id=partner_order_id&" +              //가맹점 주문번호
                    "partner_user_id=partner_user_id&" +                //가맹점 회원id
                    "item_name="+payDoc+"&" +                           //상품명
                    "quantity=1&" +                                     //상품 수량
                    "total_amount="+payMoney+"&" +                      //상품 총액
                    "tax_free_amount=450&" +                            //상품 비과세 금액
                    "approval_url=http://localhost:8085/pay/success&" + //결제 성공 시 redirect url
                    "cancel_url=http://localhost:8085/pay/fail&" +      //결제 취소 시 redirect url
                    "fail_url=http://localhost:8085/pay/fail&";         //결제 실패 시 redirect url

            OutputStream outputStream = httpURLConnection.getOutputStream();        //줄 애
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

            //카카오페이 Response : tid, pcurl 가져오기
            String json = bufferedReader.readLine();

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode parsedData = objectMapper.readTree(json);

            String tid = parsedData.get("tid").asText();
            String pcurl = parsedData.get("next_redirect_pc_url").asText();

            KakaoResDto kakaoResDto = new KakaoResDto();
            kakaoResDto.setTid(tid);
            kakaoResDto.setNext_redirect_pc_url(pcurl);

            //DB 저장
            Pay saved = payRepository.save(pay);

            return pcurl;
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

}
