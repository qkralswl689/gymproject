package com.gym.project.board.entity;

import com.gym.project.file.entity.FileEntity;
import com.gym.project.user.entity.UserEntity;
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
    private Long boardIndex;

    @ManyToOne
    @JoinColumn(name = "userindex")
    private UserEntity user;

//    @Column(name = "fileindex")
//    private int fileIndex;

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

     @OneToMany(mappedBy = "board")
     private FileEntity file;



    @Builder
    public BoardEntity(Long boardIndex,UserEntity user,String title,String content,String boardClass,int fileIndex,int view,int reply){
        this.boardIndex = boardIndex;
        this.title = title;
        this.content = content;
        this.boardClass = boardClass;
        //this.fileIndex = fileIndex;
        this.view = view;
        this.user = user;
        this.reply = reply;
    }

}
