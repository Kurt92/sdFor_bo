package com.jt.sdfor.board.unit;

import com.jt.sdfor.biz.ctgy.board1.dto.Board1Dto;
import com.jt.sdfor.biz.ctgy.board1.repository.Board1QueryDslRepository;
import com.jt.sdfor.biz.ctgy.board1.service.Board1Service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class BoardServiceTest {

    @Mock
    Board1QueryDslRepository board1QueryDslRepository;

    @InjectMocks
    Board1Service boardService;


    @Test
    @DisplayName("")
    public void sample1() {
        //given
        List<Board1Dto.Response.Search> expect = List.of(
                Board1Dto.Response.Search.builder()
                        .title("title")
                        .content("content")
                        .build()
        );

        given(board1QueryDslRepository.sample1()).willReturn(expect);

        //when
        List<Board1Dto.Response.Search> result = boardService.sample1();

        //then
        assertEquals(expect.get(0).getTitle(), result.get(0).getTitle());

    }

}
