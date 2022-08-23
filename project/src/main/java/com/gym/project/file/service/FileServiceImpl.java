package com.gym.project.file.service;

import com.gym.project.file.dto.FileDTO;
import com.gym.project.file.entity.FileEntity;
import com.gym.project.file.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FileServiceImpl implements FileService{

    @Autowired
    private FileRepository fileRepository;

    public FileServiceImpl(FileRepository fileRepository){
        this.fileRepository = fileRepository;
    }


    @Transactional
    @Override
    public int saveFile(FileDTO fileDTO) {
        return fileRepository.save(fileDTO.toEntity()).getFileIndex();
    }

    @Transactional
    @Override
    public FileDTO getFile(int fineIndex) {

        FileEntity file = fileRepository.findById(fineIndex).get();

        FileDTO fileDTO = FileDTO.builder()
                .fileIndex(fineIndex)
                .fileOriginName(file.getFileOriginName())
                .fileName(file.getFileName())
                .filePath(file.getFilePath())
                .build();

        return fileDTO;
    }
}
