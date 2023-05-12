package com.sonujha;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}
	
	@RequestMapping("submitdetail")
	public String submitDetail(HttpServletRequest request) {
		String name = request.getParameter("firstName");
		request.setAttribute("firstName", name);
		return "look";
	}
	
}
