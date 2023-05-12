package com.sonujha;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sonujha.model.User;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("viewform");
		User user = new User();
		Map<String, String> map = new HashMap<>();
		map.put("male", "Male");
		map.put("female", "Female");
		modelAndView.addObject("map", map);
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	@PostMapping("/formsubmit")
	public ModelAndView formSubmit(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("viewuser");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
}
