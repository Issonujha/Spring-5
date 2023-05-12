package com.sonujha;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "hello";
	}
	
	@GetMapping("submitdetail")
	public ModelAndView submitDetail(@RequestParam("firstName") String firstName) {
		ModelAndView modelAndView = new ModelAndView();
		List<String> names = new ArrayList<>();
		names.add("Rajesh");
		names.add("rohit");
		names.add("raj");
		names.add("prabhaat");
		Date date = new Date();
		modelAndView.addObject("name", firstName);
		modelAndView.addObject("team", names);
		modelAndView.addObject("date", date);
		return modelAndView;
	}
	
}
