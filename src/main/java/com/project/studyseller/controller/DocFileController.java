package com.project.studyseller.controller;

import com.project.studyseller.data.dto.ChangeDocFileLinkDto;
import com.project.studyseller.data.dto.DocFileDto;
import com.project.studyseller.data.dto.DocFileResponseDto;
import com.project.studyseller.service.DocFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docFile")
public class DocFileController {

    private  final DocFileService docFileService;

    @Autowired
    public DocFileController(DocFileService docFileService) {
        this.docFileService = docFileService;
    }

    @GetMapping()
    public ResponseEntity<DocFileResponseDto> getDocFile(Long fileSn){
        DocFileResponseDto docFileResponseDto = docFileService.getDocFile(fileSn);

        return ResponseEntity.status(HttpStatus.OK).body(docFileResponseDto);
    }

    @PostMapping()
    public ResponseEntity<DocFileResponseDto> createDocFile(@RequestBody DocFileDto docFileDto){
        DocFileResponseDto docFileResponseDto = docFileService.saveDocFile(docFileDto);

        return ResponseEntity.status(HttpStatus.OK).body(docFileResponseDto);
    }

    @PutMapping()
    public ResponseEntity<DocFileResponseDto> changeDocFile(
            @RequestBody ChangeDocFileLinkDto changeDocFileLinkDto) throws Exception{
        DocFileResponseDto docFileResponseDto = docFileService.changeDocFileLink(
                changeDocFileLinkDto.getFileSn(),
                changeDocFileLinkDto.getFileLink());

        return ResponseEntity.status(HttpStatus.OK).body(docFileResponseDto);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteDocFile(Long fileSn) throws Exception{
        docFileService.deleteDocFile(fileSn);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }

}
