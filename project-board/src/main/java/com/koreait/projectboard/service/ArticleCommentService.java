package com.koreait.projectboard.service;

import com.koreait.projectboard.domain.type.SearchType;
import com.koreait.projectboard.dto.ArticleCommentDto;
import com.koreait.projectboard.repository.ArticleCommentRepository;
import com.koreait.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@RequiredArgsConstructor
@Service
public class ArticleCommentService {
    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true) // 데이터에 변화는 주지 않고 보기만 히는것으로 옵션값 변경해준것
    public List<ArticleCommentDto> searchArticleComments(Long articleId){ // 리스트 검색(보기)
        return List.of();
    }

    public void saveArticleComment(ArticleCommentDto dto){ // 저장

    }

    public void updateArticleComment(ArticleCommentDto dto){ // 수정

    }

    public void deleteArticleComment(Long articleCommentId){ // 삭제

    }
}
