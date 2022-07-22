package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.Board;
import com.spring.mapper.BoardMapper;


@Controller
public class BoardController {
	/*
	 * @Autowired private BoardMapper mapper;
	 * 
	 * @GetMapping("/boardList.do") public String board(Model model) {
	 * 
	 * List<Board> boards = mapper.getLists(); model.addAttribute("boards", boards);
	 * return "boardList"; }
	 * 
	 * @GetMapping("/boardForm.do") public String boardForm(@ModelAttribute Board
	 * board) { return "boardForm"; }
	 * 
	 * @PostMapping("/boardInsert.do") public String boardInsert(@ModelAttribute
	 * Board board) {
	 * 
	 * mapper.boardInsert(board); return "redirect:/boardList.do"; }
	 * 
	 * @GetMapping("/boardContent.do") public String boardContent(int idx, Model
	 * model) { Board board = mapper.boardContent(idx); mapper.boardCount(idx);
	 * model.addAttribute("board",board); return "boardContent"; }
	 * 
	 * @GetMapping("/boardDelete.do") public String boardDelete(int idx) {
	 * 
	 * mapper.boardDelete(idx); return "redirect:/boardList.do"; }
	 * 
	 * 
	 * @GetMapping("/boardUpdateForm.do") public String
	 * boardUpdateForm(@RequestParam("idx") int idx, Model model) { Board board =
	 * mapper.boardContent(idx); model.addAttribute("board",board); return
	 * "boardUpdate"; }
	 * 
	 * @PostMapping("/boardUpdate.do") public String boardUpdate(Board board) {
	 * mapper.boardUpdate(board); return "redirect:/boardList.do"; }
	 */
	
 
	@RequestMapping("/boardMain.do")
	public String main() {
		return "/board/main";
	}
	
	
	
}
