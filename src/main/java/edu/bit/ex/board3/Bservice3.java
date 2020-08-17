package edu.bit.ex.board3;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.board1.BDto;

//interface는 필요 없음
//sqlSession에서 제공하는 함수(selectList, selectOne)를 이용함
//쿼리구현을 위한 XML이 필요. 해당 XML의 namespace는 개발자가 정함

@Service
public class Bservice3 {
	
	@Inject
	BoardMapper boardMapper; //sqlSession 자체가 mybatis 스프링빈에 있어야 인젝트 시킴
	
	public List<BDto> selectBoardList() throws Exception {
		
		return boardMapper.selectList();

	}
}
