package com.project.studyseller.data.repository;

import com.project.studyseller.data.entity.Member;
import com.project.studyseller.data.entity.Pay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayRepository extends JpaRepository<Pay, Long> {
}
