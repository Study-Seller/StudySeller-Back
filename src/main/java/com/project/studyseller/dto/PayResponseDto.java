package com.project.studyseller.dto;

import com.project.studyseller.entity.Member;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor //모든 생성자 만들어줌.
@ToString
//프론트로부터 다음과 같은 데이터를 받아서 controller로 전달하는 객체
public class PayResponseDto {
    private String  cid;
    private String  partner_order_id;
    private String  partner_user_id;
    private String  item_name;
    private int quantity;
    private int total_amount;
    private int tax_free_amount;
    private String approval_url;
    private String cancel_url;
    private String fail_url;




}
