package com.gym.project.board.service;

import com.gym.project.board.dto.BoardDTO;
import com.gym.project.board.entity.BoardEntity;

import java.util.List;

public interface BoardService {

    int saveBoard(BoardDTO boardDTO);

    BoardDTO getBoard(int boardIndex);

    List<BoardEntity> getBoards() throws Exception;


}
