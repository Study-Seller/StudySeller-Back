package com.project.studyseller.data.repository;
import com.project.studyseller.data.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentRepository extends JpaRepository<Document, Long> {
}
