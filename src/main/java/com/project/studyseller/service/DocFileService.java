package com.project.studyseller.service;

import com.project.studyseller.data.dto.DocFileDto;
import com.project.studyseller.data.dto.DocFileResponseDto;

public interface DocFileService {
    DocFileResponseDto getDocFile(Long fileSn);
    DocFileResponseDto saveDocFile(DocFileDto docFileDto);
    DocFileResponseDto changeDocFileLink(Long fileSn, String fileLink) throws Exception;
    void deleteDocFile(Long fileSn) throws Exception;
}
