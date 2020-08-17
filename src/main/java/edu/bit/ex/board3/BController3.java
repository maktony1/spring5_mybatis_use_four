package edu.bit.ex.board3;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//인터페이스 IBDao를 XML namespace에 매핑 <mapper namespace="edu.bit.ex.board1.IBDao">
//sqlSession.getMapper(IBDao.class)를 이용 다이렉트로 갖다 꼽음 (동적으로 로딩한다~~)다이나믹로딩
/*
1. 인터페이스 위에 @를 붙이는 형식임
2. XML이 필요없음, sqlSession객체 필요없음
3. root~.xml 에 아래의 한줄을 추가
		<!-- Mapper Interface -->
		<mybatis-spring:scan base-package="edu.bit.mapper"/>
4. 쿼리가 길어지면 사용하기 힘듬

 */

@Controller
public class BController3 {
	
	@Inject
	Bservice3 bservice3;
	
	@RequestMapping("/list3")
	public String list(Model model) throws Exception {
		System.out.println("list3()");
		
		model.addAttribute("list", bservice3.selectBoardList());
		return "list";
	}
}
