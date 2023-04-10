package com.project.studyseller.data.dao;

import com.project.studyseller.data.entity.DocFile;

public interface DocFileDAO {
    DocFile insertDocFile(DocFile docFile);

    DocFile selectDocFile(Long fileSn);

    DocFile updateDocFileLink(Long fileSn, String fileLink) throws Exception;

    void deleteDocFile(Long fileSn) throws Exception;
}
