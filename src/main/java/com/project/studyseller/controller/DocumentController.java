package com.project.studyseller.controller;

import com.project.studyseller.data.dto.DocumentDto;
import com.project.studyseller.data.dto.DocumentResponseDto;
import com.project.studyseller.service.DocumentService;
import com.project.studyseller.data.dto.ChangeDocTitleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

// 예제 6.27
@RestController
@Service
@RequestMapping("/document")
@CrossOrigin(origins = "*")
public class DocumentController {
    private final DocumentService  documentService;

    @Autowired
    public DocumentController(DocumentService  documentService) {
        this. documentService =  documentService;
    }

    @GetMapping()
    public ResponseEntity<DocumentResponseDto> getDocument(Long number) {
        DocumentResponseDto  documentResponseDto =  documentService.getDocument(number);

        return ResponseEntity.status(HttpStatus.OK).body( documentResponseDto);
    }

    @PostMapping()
    public ResponseEntity<DocumentResponseDto> createDocument(@RequestBody DocumentDto  documentDto) {
        DocumentResponseDto  documentResponseDto =  documentService.saveDocument(documentDto);

        return ResponseEntity.status(HttpStatus.OK).body(documentResponseDto);
    }

    @PutMapping()
    public ResponseEntity<DocumentResponseDto> changeDocTitle(
            @RequestBody ChangeDocTitleDto changeDocTitleDto) throws Exception {
        DocumentResponseDto  documentResponseDto =  documentService.changeDocTitle(
                changeDocTitleDto.getDocSN(),
                changeDocTitleDto.getDocTitle());

        return ResponseEntity.status(HttpStatus.OK).body( documentResponseDto);

    }

    @DeleteMapping()
    public ResponseEntity<String> deleteDocument(Long number) throws Exception {
        documentService.deleteDocument(number);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}
