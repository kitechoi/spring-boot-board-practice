package com.celine.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class BoardFileDTO {
    private Long id;
    private Long boardId;
    private String originalFileName;    // 사용자의 파일이름
    private String storedFileName;  // 파일을 저장할 때 쓸 이름
}
