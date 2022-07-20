package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/boardForm.do")
	public String boardForm(@ModelAttribute Board board) {
		return "boardForm";
	}
	
	@PostMapping("/boardInsert.do")
	public String boardInsert(@ModelAttribute Board board) {
		
		mapper.boardInsert(board);
		return "redirect:/boardList.do";
	}
}
