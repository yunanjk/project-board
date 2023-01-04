package com.koreait.projectboard.controller;

import com.koreait.projectboard.config.SecurityConfig;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@DisplayName("View 컨트롤러 - 게시글")
@WebMvcTest(ArticleController.class)
@Import(SecurityConfig.class)
class ArticleControllerTest {
    private final MockMvc mvc;

    public  ArticleControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

//    @Disabled("정상")
    @DisplayName("[view][GET] 게시글 리스트 게시판 페이지")
    @Test
    public void read() throws Exception {
        mvc.perform(get("/articles"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
//                .andExpect(content().contentType(MediaType.TEXT_HTML))   // 오류
                .andExpect(model().attributeExists("articles"));    // articles 데이터를 받아서 처리
    }

    @Disabled("정상")
    @DisplayName("[view][GET] 게시글 상세 페이지")
    @Test
    public void detail() throws Exception {
        mvc.perform(get("/articles/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(model().attributeExists("article"));
    }

    @Disabled("구현중")
    @DisplayName("[view][GET] 게시글 검색 전용 페이지")
    @Test
    public void search() throws Exception {
        mvc.perform(get("/articles/search"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML));

    }

    @Disabled("구현중")
    @DisplayName("[view][GET] 게시글 해시태그 검색 페이지")
    @Test
    public void hashtag() throws Exception {
        mvc.perform(get("/articles/search-hashtag"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML));
    }


}