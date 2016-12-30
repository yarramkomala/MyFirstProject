package com.niit.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.UserDAO;
import com.niit.daoimpl.*;

@Controller
public class HelloWorldController {
	@RequestMapping("/")
	public String getHome() {

		return "index";
	}
	@RequestMapping("/login")
	public String getLogin() {

		return "login";
	}
	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("email") String email,@RequestParam("pwd")String pwd){
		System.out.println("validate methode");
		ModelAndView mv=new ModelAndView("login");
		UserDAO userDAO=new  UserDaoIMPL();
		if(userDAO.isValidCredentials(email,pwd)==true){
			mv.addObject("successmsg","you  logged in successfully");
			
		}
		else{
			mv.addObject("errormsg","please try again,");
		}
		return mv;
	}
	
}

