package com.lagou.bootmybatis.mapper;

import com.lagou.bootmybatis.pojo.Comment;
import org.apache.ibatis.annotations.Select;

public interface CommentMapper {

    @Select("select * from t_comment where id = #{id}")
    Comment findById(Integer id);
}
