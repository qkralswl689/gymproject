package com.gym.project.file.entity;

import com.gym.project.board.entity.BoardEntity;
import com.gym.project.entity.BaseEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "file")
public class FileEntity extends BaseEntity {

    @Id
    @Column(name = "fileindex")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int fileIndex; // 파일번호

    @Column(name = "filename")
    private String fileName; // 저장할때

    @Column(name = "fileoriginname")
    private String fileOriginName; // 받아올 때 파일 이름

    @Column(name = "filepath")
    private String filePath; // 저장 및 불러올 경로

    @ManyToOne
    @JoinColumn(name = "boardindex")
    private BoardEntity board;


    @Builder
    public FileEntity(int fileIndex, String fileName, String fileOriginName, String filePath){
        this.fileIndex = fileIndex;
        this.fileName = fileName;
        this.fileOriginName = fileOriginName;
        this.filePath = filePath;
    }
}
