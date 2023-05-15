package com.project.studyseller.controller;

import com.project.studyseller.dto.MemberDto;
import com.project.studyseller.entity.Member;
import com.project.studyseller.repository.MemberRepository;
import com.project.studyseller.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*") //cors정책 -> 이게 없으면 통신이 안됨.
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/login")
    public String login(@RequestBody MemberDto memberDto){
        String memberCheck = memberService.memberCheck(memberDto);
        return memberCheck;
    }

}
