package com.gym.project.board.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="board")
@NoArgsConstructor
@Data
public class BoardEntity {


    @Id
    @Column(name = "boardindex")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int boardIndex;


    @Column(name = "userindex")
    private int userIndex;

    @Column(name = "fileindex")
    private int fileIndex;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

     @Column(name = "boardclass")
     private String boardClass;

     @Column(name = "view")
     private int view;

     @Column(name = "reply")
     private int reply;



    @Builder
    public BoardEntity(int boardIndex,int userIndex,String title,String content,String boardClass,int fileIndex,int view,int reply){
        this.boardIndex = boardIndex;
        this.title = title;
        this.content = content;
        this.boardClass = boardClass;
        this.fileIndex = fileIndex;
        this.view = view;
        this.userIndex = userIndex;
        this.reply = reply;
    }

}
