package com.celine.board.service;

import com.celine.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class BoardService {
    private final BoardRepository boardRepository;
}
