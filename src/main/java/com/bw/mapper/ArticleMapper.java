package com.bw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Article;
import com.bw.entity.Condition;

public interface ArticleMapper {

	List<Article> list(@Param("con")Condition con, @Param("sortt")int sortt);

}
