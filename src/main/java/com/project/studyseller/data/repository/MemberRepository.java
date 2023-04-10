// 엔티티가 생성한 데이터베이스에 접근하는데 사용

package com.project.studyseller.data.repository;

import com.project.studyseller.data.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
