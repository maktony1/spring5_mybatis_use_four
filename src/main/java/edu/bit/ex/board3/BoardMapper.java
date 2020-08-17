package edu.bit.ex.board3;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import edu.bit.ex.board1.BDto;

public interface BoardMapper {
	
	@Select("select * from mvc_board order by bGroup desc, bStep asc")
	public List<BDto> selectList();
}
