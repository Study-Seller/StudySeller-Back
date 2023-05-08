package com.project.studyseller.data.entity;

import jakarta.persistence.*;
import lombok.*;
//import org.hibernate.annotations.UpdateTimestamp;
//import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "document")
@Getter
@Setter
@ToString

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)     //JPA 구현체가 자동으로 생성 전략
    private Long DocSN;    //문서 코드


    @Column(nullable = false, length = 50)
    private String DocTitle;   //문서명

    @Column()
    private Integer category;   //문서 카테고리

//    @CreatedDate        //Insert 시 시간 자동 저장
//    @UpdateTimestamp        //Update 시 시간 자동 저장
    @Column(nullable = false)
    private String DocContent;  //문서 본문

    @Column()
    private int price;  //가격

//    @Lob
    @Column(nullable = false)
    private String DocDetail;  //문서 부가 설명

    @Column()
    private Boolean DocSellPrice;    //유무료 결정


    @Column()
    private Boolean DocPrivate; //문서 공개 여부
    @Column()
    private LocalDateTime regTime;  //등록 시간
    @Column()
    private LocalDateTime updateTime;   //수정시간

//    @Builder
//    public Document(String DocTitle, String DocContent, String DocDetail ){
//        this.DocTitle = DocTitle;
//        this.DocContent = DocContent;
//
//        this.DocDetail = DocDetail;

//    }

}
