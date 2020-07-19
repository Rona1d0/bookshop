package com.cbp.centurybookpavilion;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cbp.centurybookpavilion.mapper.ArticleMapper;
import com.cbp.centurybookpavilion.mapper.TypeMapper;
import com.cbp.centurybookpavilion.pojo.TbArticle;
import com.cbp.centurybookpavilion.pojo.TbType;
import com.cbp.centurybookpavilion.vo.ArticleVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.List;

@SpringBootTest
class CenturybookpavilionApplicationTests {

    @Autowired
    private TypeMapper typeMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Test
    void contextLoads() {
    }

    /**
     * 测试条件查询
     */
    @Test
    void testWrapper(){
        QueryWrapper<TbType> query = Wrappers.query();
        query.eq("id",2);
        TbType type = new TbType();
        type.setBookType("历史");
        type.setId(2);
        query.setEntity(type);
        TbType tbType = typeMapper.selectOne(query);
        System.out.println(tbType.toString());
    }
    @Test
    void testArticle(){
        List<ArticleVo> articleVos = articleMapper.selectArticle();
        for (ArticleVo article :
                articleVos) {
            System.out.println(article);
        }
    }
    @Test
    void testPage(){
        IPage<TbArticle> page = new Page<>(1,1);
        IPage<TbArticle> iPage = articleMapper.selectPage(page, null);
        System.out.println(iPage);
    }
}
