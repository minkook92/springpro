package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.spring.entity.Board;

@Mapper
public interface BoardMapper {
//	@Select("select * from myboard")
	public List<Board> getLists();
	
	public void boardInsert(Board board);
}
