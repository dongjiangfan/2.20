package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.entity.Article;
import com.bw.entity.Condition;
import com.bw.mapper.ArticleMapper;
import com.bw.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleMapper articleMapper;
	
	@Override
	public List<Article> list(Condition con, int sortt) {
		return articleMapper.list(con,sortt);
	}

}
