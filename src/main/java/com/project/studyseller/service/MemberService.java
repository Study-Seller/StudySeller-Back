package com.project.studyseller.service;

import com.project.studyseller.data.dto.MemberDto;
import com.project.studyseller.data.dto.MemberResonseDto;

public interface MemberService {
    MemberResonseDto getMember(Long user_SN);

    MemberResonseDto saveMember(MemberDto memberDto);

    MemberResonseDto changeMemberName(Long user_SN, String user_name) throws Exception;

    void deleteMember(Long user_SN) throws Exception;
}
