package com.project.studyseller.service;

import com.project.studyseller.dto.MemberDto;
import com.project.studyseller.entity.Member;
import com.project.studyseller.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;
    public String memberCheck(MemberDto memberDto){

        String userId = memberDto.getUserId();
        String userPw = memberDto.getUserPw();

        Member member = memberRepository.findByUserId(userId);

        if(member == null){
            //id가 없을 때
            return "id를 확인해주세요.";
        }else{
            //id가 있을 때 -> pw확인
            if(member.getUserPw().equals(userPw)){
                return "로그인 성공";
            }else{
                return "pw를 확인해주세요.";
            }
        }

    }
}
