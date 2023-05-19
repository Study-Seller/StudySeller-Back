package com.project.studyseller.controller;

import com.project.studyseller.dto.MemberDto;
import com.project.studyseller.entity.Member;
import com.project.studyseller.repository.MemberRepository;
import com.project.studyseller.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") //cors정책 -> 이게 없으면 통신이 안됨.
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    //로그인 시 성공 여부 확인
    @PostMapping("/login")
    public String join(@RequestBody MemberDto memberDto){
        String memberCheck = memberService.memberCheck(memberDto);
        return memberCheck;
    }

    //회원가입 시 디비 저장
    @PostMapping("/join")
    public String login(@RequestBody MemberDto memberDto){
        Member member = memberDto.toEntity();
        String memberJoin = memberService.memberJoin(member);
        return memberJoin;
    }

    //Member테이블 컬럼 중 notionId의 데이터들(null제외)을 리턴
    @GetMapping("/info")
    public List<String> notionInfo(){
        List<String> notionInfo = memberService.notionInfo();
        return notionInfo;
    }


}
