package edu.bit.ex.board1;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class Bservice {
	
	@Inject
	SqlSession sqlSession; //sqlSession 자체가 mybatis 스프링빈에 있어야 인젝트 시킴
	
	public List<BDto> selectBoardList() throws Exception {
		IBDao dao = sqlSession.getMapper(IBDao.class); //01010덩어리를 다이렉트로 때려박는다 (동적 로딩)
		return dao.listDao();
	}
}
