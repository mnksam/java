package com.FirstJavaProgram.nagarro.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	@RequestMapping(value="/add")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();
		int a = Integer.parseInt(req.getParameter("t1"));
		int b = Integer.parseInt(req.getParameter("t2"));
		int c=a+b;
		mv.addObject("result", c);
		mv.setViewName("addResult");
		return mv;

	}
}
