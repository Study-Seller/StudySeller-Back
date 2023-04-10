package com.project.studyseller.data.dao.impl;

import com.project.studyseller.data.dao.MemberDAO;
import com.project.studyseller.data.entity.Member;
import com.project.studyseller.data.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MemberDAOImpl implements MemberDAO {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberDAOImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member insertMember(Member member) {
        Member savedMember = memberRepository.save(member);
        return savedMember;
    }

    @Override
    public Member selectMember(Long userSn) {
        Member selectedMember = memberRepository.getById(userSn);

        return selectedMember;
    }

    @Override
    public Member updateMemberName(Long userSn, String userName) throws Exception {
        Optional<Member> selectedMember = memberRepository.findById(userSn);

        Member updatedMember;
        if(selectedMember.isPresent()){
            Member member = selectedMember.get();

            member.setUserName(userName);

            updatedMember = memberRepository.save(member);
        }else{
            throw new Exception();
        }

        return updatedMember;
    }

    @Override
    public void deleteMember(Long userSn) throws Exception {
        Optional<Member> selectedMember = memberRepository.findById(userSn);   //findById() 메서드를 통해 객체를 가져오는 작업 수행

        if(selectedMember.isPresent()){
            Member member = selectedMember.get();

            memberRepository.delete(member);    //delete()메서드를 통해 해당 객체를 삭제하게끔 삭제 요청
        }else{
            throw new Exception();
        }
    }
}
