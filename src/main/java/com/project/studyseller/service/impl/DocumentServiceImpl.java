package com.project.studyseller.service.impl;

import com.project.studyseller.data.dao.DocumentDAO;
import com.project.studyseller.data.dto.DocumentDto;
import com.project.studyseller.data.dto.DocumentResponseDto;
import com.project.studyseller.data.entity.Document;
import com.project.studyseller.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.time.LocalDateTime;

@Service
public class DocumentServiceImpl implements DocumentService {
    private final DocumentDAO documentDAO;

    @Autowired
    public DocumentServiceImpl(DocumentDAO documentDAO){
        this.documentDAO = documentDAO;
    }

    @Override
    public DocumentResponseDto getDocument(Long DocSN) {
        Document document = documentDAO.selectDocument(DocSN);
        DocumentResponseDto documentResponseDto = new DocumentResponseDto();
        documentResponseDto.setDocSN(document.getDocSN());
        documentResponseDto.setDocTitle(document.getDocTitle());
        documentResponseDto.setDocContent(document.getDocContent());
        documentResponseDto.setDocDetail(document.getDocDetail());
        documentResponseDto.setCategory(document.getCategory());
        documentResponseDto.setPrice(document.getPrice());
        documentResponseDto.setDocPrivate(document.getDocPrivate());
        documentResponseDto.setDocSellPrice(document.getDocSellPrice());

        return documentResponseDto;
    }

    @Override
    public DocumentResponseDto saveDocument(DocumentDto documentDto){
        Document document = new Document();
        document.setDocTitle(documentDto.getDocTitle());
        document.setDocContent(documentDto.getDocContent());
        document.setDocDetail(documentDto.getDocDetail());
        document.setPrice(documentDto.getPrice());
        document.setCategory(documentDto.getCategory());
        document.setDocPrivate(documentDto.getDocPrivate());
        document.setDocSellPrice(documentDto.getDocSellPrice());

        document.setRegTime(LocalDateTime.now());
        document.setUpdateTime(LocalDateTime.now());

        Document savedDocument = documentDAO.insertDocument(document);
        DocumentResponseDto documentResponseDto = new DocumentResponseDto();
        documentResponseDto.setDocSN(savedDocument.getDocSN());
        documentResponseDto.setDocTitle(savedDocument.getDocTitle());
        documentResponseDto.setDocContent(savedDocument.getDocContent());
        documentResponseDto.setDocDetail(documentResponseDto.getDocDetail());
        documentResponseDto.setPrice(savedDocument.getPrice());
        documentResponseDto.setCategory(savedDocument.getCategory());
        documentResponseDto.setDocPrivate(document.getDocPrivate());
        documentResponseDto.setDocSellPrice(document.getDocSellPrice());

        return new DocumentResponseDto();
    }

    @Override
    public DocumentResponseDto changeDocTitle(Long DocSN, String DocTitle) throws Exception{
        Document changeDocument = documentDAO.updateDocTitle(DocSN, DocTitle);

        DocumentResponseDto documentResponseDto = new DocumentResponseDto();
        documentResponseDto.setDocSN(changeDocument.getDocSN());
        documentResponseDto.setDocTitle(changeDocument.getDocTitle());
        documentResponseDto.setDocContent(changeDocument.getDocContent());
        documentResponseDto.setDocDetail(changeDocument.getDocDetail());
        documentResponseDto.setCategory(changeDocument.getCategory());
        documentResponseDto.setDocPrivate(changeDocument.getDocPrivate());
        documentResponseDto.setDocSellPrice(changeDocument.getDocSellPrice());
        documentResponseDto.setPrice(changeDocument.getPrice());

        return documentResponseDto;
    }

    @Override
    public void deleteDocument(Long DocSN) throws Exception{
        documentDAO.deleteDocument(DocSN);
    }
}
