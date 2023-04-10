package com.project.studyseller.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DocFile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fileSn;

    @ManyToOne
    @JoinColumn(name = "fileDocSn")
    private Document docSn;

    @Column(nullable = false)
    private String fileLink;
}
