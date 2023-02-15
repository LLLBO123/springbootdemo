package com.lagou.bootmybatis;

import com.lagou.bootmybatis.mapper.ArticleMapper;
import com.lagou.bootmybatis.mapper.CommentMapper;
import com.lagou.bootmybatis.pojo.Article;
import com.lagou.bootmybatis.pojo.Comment;
import com.lagou.bootmybatis.util.RedisUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class BootmybatisApplicationTests {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    void findCommentById() {
        Comment comment = commentMapper.findById(1);
        System.out.println(comment);
    }


    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void findArticleById() {
        Article article = articleMapper.selectByPrimaryKey(1);
        System.out.println(article);
    }


    //写入，key:1，value：mysql数据库中id为1的article记录
    @Autowired
    private RedisUtils redisUtils;

    @Test
    void writeRedis(){
        redisUtils.set("1",articleMapper.selectByPrimaryKey(1));
        System.out.println("success");
    }

    @Test
    void readRedis(){
        Article article = (Article) redisUtils.get("1");
        System.out.println(article);
    }

}


















