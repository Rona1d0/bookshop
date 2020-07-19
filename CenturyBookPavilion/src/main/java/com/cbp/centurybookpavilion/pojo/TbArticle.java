package com.cbp.centurybookpavilion.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_article")
public class TbArticle {
    @TableId(type = IdType.AUTO,value = "article_id")
    private Integer articleId;
    private String articleTitle;
    private String articleContent;
    private Integer studentId;
    
}
