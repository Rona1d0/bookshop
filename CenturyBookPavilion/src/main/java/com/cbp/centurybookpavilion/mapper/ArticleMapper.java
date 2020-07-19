package com.cbp.centurybookpavilion.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cbp.centurybookpavilion.pojo.TbArticle;
import com.cbp.centurybookpavilion.vo.ArticleVo;

import java.util.List;

public interface ArticleMapper extends BaseMapper<TbArticle> {
    //联合查询
    List<ArticleVo> selectArticle();
}
