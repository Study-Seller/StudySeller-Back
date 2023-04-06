package com.project.studyseller.service;

import com.project.studyseller.data.dto.DocumentDto;
import com.project.studyseller.data.dto.DocumentResponseDto;

//기본적이 CRUD 기능 호출을 위한 메소드 정의
public interface DocumentService {
    DocumentResponseDto getDocument(Long DocSN);
    DocumentResponseDto saveDocument(DocumentDto documentDto);
    DocumentResponseDto changeDocTitle(Long DocSN, String DocTitle) throws Exception;
    void deleteDocument(Long DocSN) throws Exception;
}
