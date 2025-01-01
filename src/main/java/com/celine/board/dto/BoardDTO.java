package com.celine.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@ToString

public class BoardDTO {
    private Long id;

    private String boardWriter;

    private String boardPass;

    private String boardTitle;

    private String boardContents;

    private int boardHits;  // 조회수

    private String createdAt;

    private int fileAttached;   // 파일이 첨부됐는지 안됐는지 여부
    private List<MultipartFile> boardFile;    // 다중 파일을 담기 위한 필드

}
