package com.gym.project.file.service;

import com.gym.project.file.dto.FileDTO;

public interface FileService {

    public int saveFile(FileDTO fileDTO);

    public FileDTO getFile(int fineIndex);
}
