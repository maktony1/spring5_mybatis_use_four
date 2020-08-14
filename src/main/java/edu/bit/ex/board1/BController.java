package edu.bit.ex.board1;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BController {
	
	@Inject
	Bservice bservice;
	
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		System.out.println("list()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
	}
}
