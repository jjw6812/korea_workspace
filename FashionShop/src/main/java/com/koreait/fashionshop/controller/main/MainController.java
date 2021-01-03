package com.koreait.fashionshop.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String main() {
		return "index";
	}
}