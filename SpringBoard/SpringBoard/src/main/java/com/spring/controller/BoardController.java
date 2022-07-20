package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.entity.Board;
import com.spring.mapper.BoardMapper;


@Controller
public class BoardController {

	@Autowired
	private BoardMapper mapper;
	
	@GetMapping("/boardList.do")
	public String board(Model model) {
		
		List<Board> boards = mapper.getLists();
		model.addAttribute("boards", boards);
		
		return "boardList";
	}
}
