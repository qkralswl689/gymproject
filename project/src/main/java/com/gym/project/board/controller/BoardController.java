package com.gym.project.board.controller;

import com.gym.project.board.dto.BoardDTO;
import com.gym.project.board.entity.BoardEntity;
import com.gym.project.board.repository.BoardRepository;
import com.gym.project.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/post")
    public String post(){
        return "html/post";
    }

//    // 게시물 작성
//    @PostMapping
//    public ResponseEntity<?> postBoard(@RequestBody BoardDTO board){
//
//    }
}
