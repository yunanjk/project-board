package com.koreait.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private long id;
    private Article article; // 게시글(id)
    private String content; // 본문
    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
