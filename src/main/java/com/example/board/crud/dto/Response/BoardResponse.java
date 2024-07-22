package com.example.board.crud.dto.Response;


import com.example.board.crud.domain.BoardEntity;
import jdk.jshell.Snippet;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
public class BoardResponse {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;

    public static BoardResponse of(BoardEntity boardEntity){
        return BoardResponse.builder()
                .id(boardEntity.getId())
                .title(boardEntity.getTitle())
                .content(boardEntity.getContent())
                .createdDate(boardEntity.getCreatedDate())
                .modifiedDate(boardEntity.getModifiedDate().build());
    }

}
