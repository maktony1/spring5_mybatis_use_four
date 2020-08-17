package edu.bit.ex.board4;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.ex.board3.BoardMapper;


/*
3. root~.xml 에 아래의 한줄을 추가
		<!-- Mapper Interface -->
		<mybatis-spring:scan base-package="edu.bit.mapper"/>
 */

@Controller
public class BController4 {
	
	@Inject
	Bservice4 bservice4;
	
	@RequestMapping("/list4")
	public String list(Model model) throws Exception {
		System.out.println("list4()");
		
		model.addAttribute("list", bservice4.selectBoardList());
		return "list";
	}
}
