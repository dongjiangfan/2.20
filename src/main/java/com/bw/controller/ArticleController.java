package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.entity.Article;
import com.bw.entity.Condition;
import com.bw.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ArticleController {

	@Autowired
	ArticleService articleService;

	@RequestMapping
	public String list(Model model,Condition con,@RequestParam(defaultValue="1")int sortt,@RequestParam(defaultValue="1")int pageNum){
		
		PageHelper.startPage(pageNum,5);
		
		List<Article> list = articleService.list(con,sortt);
		
		PageInfo<Article> pageInfo = new PageInfo<Article>(list);
		
		model.addAttribute("list", list);
		model.addAttribute("page", pageInfo);
		model.addAttribute("t1", con.getT1());
		model.addAttribute("t2", con.getT2());
		model.addAttribute("sortt", sortt);
		
		return "list";
	}
	
}
