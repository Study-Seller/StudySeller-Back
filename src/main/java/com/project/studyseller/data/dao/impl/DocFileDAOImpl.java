package com.project.studyseller.data.dao.impl;

import com.project.studyseller.data.dao.DocFileDAO;
import com.project.studyseller.data.entity.Category;
import com.project.studyseller.data.entity.DocFile;
import com.project.studyseller.data.repository.DocFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.print.Doc;
import java.util.Optional;

@Component
public class DocFileDAOImpl implements DocFileDAO {

    private final DocFileRepository docFileRepository;

    @Autowired
    public DocFileDAOImpl(DocFileRepository docFileRepository) {
        this.docFileRepository = docFileRepository;
    }

    @Override
    public DocFile insertDocFile(DocFile docFile) {
        DocFile savedDocFile = docFileRepository.save(docFile);
        return savedDocFile;
    }

    @Override
    public DocFile selectDocFile(Long fileSn) {
        DocFile selectedDocFile = docFileRepository.getById(fileSn);
        return selectedDocFile;
    }

    @Override
    public DocFile updateDocFileLink(Long fileSn, String fileLink) throws Exception {
        Optional<DocFile> selectedDocFile = docFileRepository.findById(fileSn);

        DocFile updatedDocFile;
        if(selectedDocFile.isPresent()){
            DocFile docFile = selectedDocFile.get();

            docFile.setFileLink(fileLink);

            updatedDocFile = docFileRepository.save(docFile);
        }else{
            throw new Exception();
        }

        return updatedDocFile;
    }

    @Override
    public void deleteDocFile(Long fileSn) throws Exception {
        Optional<DocFile> selectedDocFile = docFileRepository.findById(fileSn);

        if(selectedDocFile.isPresent()){
            DocFile docFile = selectedDocFile.get();

            docFileRepository.delete(docFile);
        }else{
            throw new Exception();
        }
    }
}
