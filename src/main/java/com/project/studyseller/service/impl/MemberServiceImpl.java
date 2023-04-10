package com.project.studyseller.service.impl;

import com.project.studyseller.data.dao.MemberDAO;
import com.project.studyseller.data.dto.MemberDto;
import com.project.studyseller.data.dto.MemberResonseDto;
import com.project.studyseller.data.entity.Member;
import com.project.studyseller.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public MemberResonseDto getMember(Long userSn) {
        Member member = memberDAO.selectMember(userSn);

        MemberResonseDto memberResonseDto = new MemberResonseDto();
        memberResonseDto.setUserSN(member.getUserSn());
        memberResonseDto.setUserId(member.getUserId());
        memberResonseDto.setUserPw(member.getUserPw());
        memberResonseDto.setUserName(member.getUserName());
        memberResonseDto.setUserIntroduce(member.getUserIntroduce());

        return memberResonseDto;
    }

    @Override
    public MemberResonseDto saveMember(MemberDto memberDto) {
        Member member = new Member();
        member.setUserId(memberDto.getUserId());
        member.setUserPw(memberDto.getUserPw());
        member.setUserName(memberDto.getUserName());
        member.setUserIntroduce(memberDto.getUserIntroduce());

        Member savedMember = memberDAO.insertMember(member);

        MemberResonseDto memberResonseDto = new MemberResonseDto();
        memberResonseDto.setUserSN(savedMember.getUserSn());
        memberResonseDto.setUserId(savedMember.getUserId());
        memberResonseDto.setUserPw(savedMember.getUserPw());
        memberResonseDto.setUserName(savedMember.getUserName());
        memberResonseDto.setUserIntroduce(savedMember.getUserIntroduce());

        return memberResonseDto;
    }

    @Override
    public MemberResonseDto changeMemberName(Long userSn, String userName) throws Exception {
        Member changedMember = memberDAO.updateMemberName(userSn, userName);

        MemberResonseDto memberResonseDto = new MemberResonseDto();
        memberResonseDto.setUserSN(changedMember.getUserSn());
        memberResonseDto.setUserId(changedMember.getUserId());
        memberResonseDto.setUserPw(changedMember.getUserPw());
        memberResonseDto.setUserName(changedMember.getUserName());
        memberResonseDto.setUserIntroduce(changedMember.getUserIntroduce());

        return memberResonseDto;
    }

    @Override
    public void deleteMember(Long userSn) throws Exception {
        memberDAO.deleteMember(userSn);
    }
}
