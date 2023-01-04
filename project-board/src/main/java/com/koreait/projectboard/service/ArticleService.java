package com.koreait.projectboard.service;

import com.koreait.projectboard.domain.type.SearchType;
import com.koreait.projectboard.dto.ArticleDto;
import com.koreait.projectboard.dto.ArticleWithCommentsDto;
import com.koreait.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true) // 데이터에 변화는 주지 않고 보기만 히는것으로 옵션값 변경해준것
    public Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword, Pageable pageable){ // 리스트 검색(보기)
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleWithCommentsDto getArticle(Long articleId){ // 검색(보기)
        return null;
    }

    public void saveArticle(ArticleDto dto){ // 저장

    }

    public void updateArticle(ArticleDto dto){ // 수정

    }

    public void deleteArticle(Long articleId){ // 삭제

    }

}
