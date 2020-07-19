package com.cbp.centurybookpavilion.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleVo {
    private Integer articleId;
    private String articleTitle;
    private String articleContent;
    private Integer studentId;
    private String studentName;
}
