package com.project.studyseller.data.dao.impl;

import com.project.studyseller.data.entity.Document;
import com.project.studyseller.data.repository.DocumentRepository;
import com.project.studyseller.data.dao.DocumentDAO;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DocumentDAOImpl implements DocumentDAO {
    private DocumentRepository documentRepository;

    @Autowired
    public DocumentDAOImpl(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    // 예제 6.11
    @Override
    public Document insertDocument(Document document) {
        Document savedDocument = documentRepository.save(document);

        return savedDocument;
    }

    // 예제 6.12
    @Override
    public Document selectDocument(Long DocSN) {
        Document selectedDocument = documentRepository.getById(DocSN);

        return selectedDocument;
    }

    // 예제 6.15
    @Override
    public Document updateDocTitle(Long DocSN, String DocTitle) throws Exception {
        Optional<Document> selectedDocument = documentRepository.findById(DocSN);

        Document updatedDocument;
        if (selectedDocument.isPresent()) {
            Document document = selectedDocument.get();

            document.setDocTitle(DocTitle);
            document.setUpdateTime(LocalDateTime.now());

            updatedDocument = documentRepository.save(document);
        } else {
            throw new Exception();
        }

        return updatedDocument;
    }

    // 예제 6.17
    @Override
    public void deleteDocument(Long DocSN) throws Exception {
        Optional<Document> selectedProduct = documentRepository.findById(DocSN);

        if (selectedProduct.isPresent()) {
            Document document = selectedProduct.get();

            documentRepository.delete(document);
        } else {
            throw new Exception();
        }
    }
}