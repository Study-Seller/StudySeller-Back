package com.project.studyseller.controller;

import com.project.studyseller.dto.ChangeMemberNameDto;
import com.project.studyseller.dto.MemberDto;
import com.project.studyseller.dto.MemberResonseDto;
import com.project.studyseller.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {

//    private final MemberService memberService;
//
//
//    @Autowired
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }
//
//    @GetMapping()
//    public ResponseEntity<MemberResonseDto> getMember(Long userSn){
//        MemberResonseDto memberResonseDto = memberService.getMember(userSn);
//
//        return ResponseEntity.status(HttpStatus.OK).body(memberResonseDto);
//    }
//
//    @PostMapping()
//    public ResponseEntity<MemberResonseDto> createMember(@RequestBody MemberDto memberDto){
//        MemberResonseDto memberResonseDto = memberService.saveMember(memberDto);
//
//        return ResponseEntity.status(HttpStatus.OK).body(memberResonseDto);
//    }
//
//    @PutMapping()
//    public ResponseEntity<MemberResonseDto> changeMemberName(
//            @RequestBody ChangeMemberNameDto changeMemberNameDto) throws Exception {
//
//        MemberResonseDto memberResonseDto = memberService.changeMemberName(
//                changeMemberNameDto.getUserSn(),
//                changeMemberNameDto.getUserName());
//
//        return ResponseEntity.status(HttpStatus.OK).body(memberResonseDto);
//    }
//
//    @DeleteMapping()
//    public ResponseEntity<String> deleteMember(Long user_SN) throws Exception{
//        memberService.deleteMember(user_SN);
//
//        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
//    }

}
