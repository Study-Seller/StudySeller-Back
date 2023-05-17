package com.project.studyseller.dto;

import lombok.Data;

@Data
//카카오페이 response : tid,pcurl
public class KakaoResDto {
    private String tid, next_redirect_pc_url;
}
