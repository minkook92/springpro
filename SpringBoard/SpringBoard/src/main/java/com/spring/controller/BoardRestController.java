package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Board;
import com.spring.mapper.BoardMapper;

@RequestMapping("/board")
@RestController
public class BoardRestController {

	@Autowired
	BoardMapper boardMapper;
	
	@GetMapping("/all")
	public List <Board> boardList(){
		
		List<Board> list = boardMapper.getLists();
		return list;
	}
	
	@PostMapping("/new")
	public void boardInsert(Board board) {
		boardMapper.boardInsert(board);
	}
	
	@DeleteMapping("/{idx}")
	public void boardDelete(@PathVariable("idx") int idx) {
		boardMapper.boardDelete(idx);
	}
	@PutMapping("/update")
	public void boardUpdate(Board board) {
		boardMapper.boardUpdate(board);
	}
	
	@GetMapping("/{idx}")
	public Board boardContent(@PathVariable("idx") int idx) {
		Board board = boardMapper.boardContent(idx);
		return board;
	};
	
	@PutMapping("/count/{idx}")
	public Board boardCount(@PathVariable("idx") int idx) {
		boardMapper.boardCount(idx);
		Board board = boardMapper.boardContent(idx);
		return board;
	}
}
