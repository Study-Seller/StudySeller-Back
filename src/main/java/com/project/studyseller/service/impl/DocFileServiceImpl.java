package com.project.studyseller.service.impl;

import com.project.studyseller.data.dao.DocFileDAO;
import com.project.studyseller.data.dto.DocFileDto;
import com.project.studyseller.data.dto.DocFileResponseDto;
import com.project.studyseller.data.entity.DocFile;
import com.project.studyseller.service.DocFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocFileServiceImpl implements DocFileService {

    private final DocFileDAO docFileDAO;

    @Autowired
    public DocFileServiceImpl(DocFileDAO docFileDAO) {
        this.docFileDAO = docFileDAO;
    }

    @Override
    public DocFileResponseDto getDocFile(Long fileSn) {
        DocFile docFile = docFileDAO.selectDocFile(fileSn);

        DocFileResponseDto docFileResponseDto = new DocFileResponseDto();
        docFileResponseDto.setFileSn(docFile.getFileSn());
        docFileResponseDto.setDocSn(docFile.getDocSn());
        docFileResponseDto.setFileLink(docFile.getFileLink());

        return docFileResponseDto;
    }

    @Override
    public DocFileResponseDto saveDocFile(DocFileDto docFileDto) {
        DocFile docFile = new DocFile();
        docFile.setDocSn(docFile.getDocSn());
        docFile.setFileLink(docFile.getFileLink());

        DocFile savedDocFile = docFileDAO.insertDocFile(docFile);

        DocFileResponseDto docFileResponseDto = new DocFileResponseDto();
        docFileResponseDto.setFileSn(savedDocFile.getFileSn());
        docFileResponseDto.setDocSn(savedDocFile.getDocSn());
        docFileResponseDto.setFileLink(savedDocFile.getFileLink());

        return docFileResponseDto;
    }

    @Override
    public DocFileResponseDto changeDocFileLink(Long fileSn, String fileLink) throws Exception {
        DocFile changedDocFile = docFileDAO.updateDocFileLink(fileSn, fileLink);

        DocFileResponseDto docFileResponseDto = new DocFileResponseDto();
        docFileResponseDto.setFileSn(changedDocFile.getFileSn());
        docFileResponseDto.setDocSn(changedDocFile.getDocSn());
        docFileResponseDto.setFileLink(changedDocFile.getFileLink());

        return docFileResponseDto;
    }

    @Override
    public void deleteDocFile(Long fileSn) throws Exception {
        docFileDAO.deleteDocFile(fileSn);
    }
}
