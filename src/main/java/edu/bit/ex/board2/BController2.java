package edu.bit.ex.board2;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//인터페이스 IBDao를 XML namespace에 매핑 <mapper namespace="edu.bit.ex.board1.IBDao">
//sqlSession.getMapper(IBDao.class)를 이용 다이렉트로 갖다 꼽음 (동적으로 로딩한다~~)다이나믹로딩
@Controller
public class BController2 {
	
	@Inject
	Bservice2 bservice2;
	
	@RequestMapping("/list2")
	public String list(Model model) throws Exception {
		System.out.println("list2()");
		
		model.addAttribute("list", bservice2.selectBoardList());
		return "list";
	}
}
