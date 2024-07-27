package com.vickee.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	@RequestMapping("home")
//	public String home() {
//		return "home";
//	}
//	
//	@RequestMapping("login")
//	public String login() {
//		return "login";
//	}
//	
//	@RequestMapping("Register")
//	public String Register() {
//		return "Register";
//	}
	
	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	@RequestMapping("validate")
	public ModelAndView validate(Login login) {
		
		String uname = login.getUname();
		String pwd = login.getPwd();
		ModelAndView mv = new ModelAndView("login");
		if(uname.equals("vickee") && pwd.equals("root")) {
			mv.addObject("Action","Success");
		}
		else {
			mv.addObject("Action","Failure");
		}
		return mv;
	}
	@RequestMapping("calc")
	public ModelAndView cal() {
		ModelAndView mv = new ModelAndView("calc");
		return mv;
	}
	
	@PostMapping("calculate")
	public ModelAndView calculate(double num1, double num2, String answer) {
			double result;
	        switch (answer) {
	            case "add":
	                result = num1 + num2;
	                break;
	            case "subtract":
	                result = num1 - num2;
	                break;
	            case "multiply":
	                result = num1 * num2;
	                break;
	            case "divide":
	                result = num1 / num2;
	                break;
	            default:
	                result = 0.0;
	        }
	        ModelAndView modelAndView = new ModelAndView("calc");
	        modelAndView.addObject("result", result);
	        return modelAndView;
	    }
	}
