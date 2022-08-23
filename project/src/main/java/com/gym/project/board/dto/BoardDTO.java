package com.gym.project.board.dto;

import com.gym.project.board.entity.BoardEntity;
import com.gym.project.entity.BaseEntity;
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
    private int userIndex;
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
                .userIndex(userIndex)
                .fileIndex(fileIndex)
                .view(view)
                .boardClass(boardClass)
                .reply(reply)
                .build();
        return build;

    }

    @Builder
    public BoardDTO(int boardIndex,int userIndex,int fileIndex,String title,String content,String boardClass,int view,int reply){
        this.boardIndex = boardIndex;
        this.userIndex = userIndex;
        this.fileIndex = fileIndex;
        this.title = title;
        this.content = content;
        this.boardClass = boardClass;
        this.view = view;
        this.reply = reply;

    }




}
