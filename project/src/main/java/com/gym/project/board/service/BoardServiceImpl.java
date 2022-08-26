package com.gym.project.board.service;

import com.gym.project.board.dto.BoardDTO;
import com.gym.project.board.entity.BoardEntity;
import com.gym.project.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository repository){
        this.boardRepository = repository;
    }

    @Transactional
    @Override
    public int saveBoard(BoardDTO boardDTO) {
        return boardRepository.save(boardDTO.toEntity()).getBoardIndex();
    }

    @Transactional
    @Override
    public BoardDTO getBoard(int boardIndex) {
        BoardEntity board = boardRepository.findById(boardIndex).get();

        BoardDTO boardDTO = BoardDTO.builder()
                .boardIndex(board.getBoardIndex())
                .boardClass(board.getBoardClass())
                .title(board.getTitle())
                .content(board.getContent())
                .fileIndex(board.getFileIndex())
                .view(board.getView())
                .reply(board.getReply())
                .build();
        return boardDTO;
    }

    @Override
    public List<BoardEntity> getBoards() throws Exception {
        List<BoardEntity> boardList = (List<BoardEntity>) boardRepository.findAll();

        return boardList;
    }
}
