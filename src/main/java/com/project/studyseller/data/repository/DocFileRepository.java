package com.project.studyseller.data.repository;

import com.project.studyseller.data.entity.DocFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocFileRepository extends JpaRepository<DocFile, Long> {
}
