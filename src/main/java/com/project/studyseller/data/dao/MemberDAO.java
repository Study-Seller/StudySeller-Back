// 데이터베이스에 접근하기 위한 로직 관리

package com.project.studyseller.data.dao;

import com.project.studyseller.data.entity.Member;

public interface MemberDAO {

    Member insertMember(Member member);

    Member selectMember(Long userSn);

    Member updateMemberName(Long userSn, String userName) throws Exception;

    void deleteMember(Long userSn) throws Exception;
}
