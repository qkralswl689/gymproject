package com.gym.project.board.controller;

import com.gym.project.board.dto.BoardDTO;
import com.gym.project.board.entity.BoardEntity;
import com.gym.project.board.repository.BoardRepository;
import com.gym.project.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;

    // 게시물 작성
    @PostMapping
    public String write(BoardDTO boardDTO){
        boardService.saveBoard(boardDTO);
        return "redirect:/list";
    }
}
