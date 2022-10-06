package com.gym.project.board.dto;

import com.gym.project.board.entity.BoardEntity;
import com.gym.project.entity.BaseEntity;
import com.gym.project.user.entity.UserEntity;
import lombok.*;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDTO extends BaseEntity {

    @Id
    private int boardIndex;
    private UserEntity user;
    private int fileIndex;
    private String title;
    private String content;
    private String boardClass;
    private int view;
    private int reply;


    public BoardEntity toEntity(){
        BoardEntity build = BoardEntity.builder()
                .boardIndex(boardIndex)
                .title(title)
                .content(content)
                .user(user)
                .fileIndex(fileIndex)
                .view(view)
                .boardClass(boardClass)
                .reply(reply)
                .build();
        return build;

    }

    @Builder
    public BoardDTO(int boardIndex,UserEntity user,int fileIndex,String title,String content,String boardClass,int view,int reply){
        this.boardIndex = boardIndex;
        this.user = user;
        this.fileIndex = fileIndex;
        this.title = title;
        this.content = content;
        this.boardClass = boardClass;
        this.view = view;
        this.reply = reply;

    }




}
