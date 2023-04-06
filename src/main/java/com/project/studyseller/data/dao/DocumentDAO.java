package com.project.studyseller.data.dao;

import com.project.studyseller.data.entity.Document;

// DTO 객체로 전달
public interface DocumentDAO {

    Document insertDocument(Document Document); //Table이름 적기

    Document selectDocument(Long DocSN);    //select는 기본키인 DocSN

    Document updateDocTitle(Long DocSN, String DocTitle) throws Exception;

    void deleteDocument(Long DocSN) throws Exception;}
