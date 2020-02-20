package com.bw.service;

import java.util.List;

import com.bw.entity.Article;
import com.bw.entity.Condition;

public interface ArticleService {

	List<Article> list(Condition con, int sortt);

}
