package com.gym.project.board.controller;

import com.gym.project.board.dto.BoardDTO;
import com.gym.project.board.entity.BoardEntity;
import com.gym.project.board.repository.BoardRepository;
import com.gym.project.board.service.BoardService;
import com.gym.project.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;

//    @Autowired
//    private UserRepository userRepository;

    // 게시물 작성
    @PostMapping("/post")
    public String write(/*@RequestParam("file") MultipartFile file,*/ BoardDTO boardDTO, HttpServletRequest request, HttpSession session, Model model)throws IOException {

        //세션에 저장된 유저 값을 불러온다.
       // User sessionUser = (User)session.getAttribute("ConfirmUser");

       // boardRepository.findId();
//        boardDTO.setUserIndex(userRepository.findByEmail("something").getUserIndex());
        boardDTO.setTitle(boardDTO.getTitle());
        boardDTO.setContent(boardDTO.getContent());
        //boardDTO.setFileIndex(boardDTO.getFileIndex());
        boardService.saveBoard(boardDTO);
        return "redirect:/list";
    }
}
