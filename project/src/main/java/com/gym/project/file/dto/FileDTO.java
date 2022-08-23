package com.gym.project.file.dto;

import com.gym.project.file.entity.FileEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FileDTO {

    private int fileIndex; // 파일번호
    private String fileName; // 저장할때
    private String fileOriginName; // 받아올 때 파일 이름
    private String filePath; // 저장 및 불러올 경로


    public FileEntity toEntity(){
        FileEntity build = FileEntity.builder()
                .fileIndex(fileIndex)
                .fileOriginName(fileOriginName)
                .fileName(fileName)
                .filePath(filePath)
                .build();
        return build;
    }


    @Builder
    public FileDTO(int fileIndex, String fileName, String fileOriginName, String filePath) {
        this.fileIndex = fileIndex;
        this.fileName = fileName;
        this.fileOriginName = fileOriginName;
        this.filePath = filePath;
    }
}
