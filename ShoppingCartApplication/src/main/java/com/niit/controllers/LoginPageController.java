package com.niit.controllers;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.domain.UserInfo;
import com.niit.service.UserService;;

@Controller
public class LoginPageController {
	@Autowired
	UserService userservice;
	@RequestMapping("/")
	public String getHome() {

		return "index";
	}
	@RequestMapping("/login")
	public String getLogin() {

		return "login";
	}
	@RequestMapping("/register")
	public String getRegister(Map<String,Object> map) {
		UserInfo userinfo=new UserInfo();
		map.put("userinfo", "userinfo");
		
		return "register";
	}
	@RequestMapping("/register.do")
	public String doAction(@ModelAttribute UserInfo userinfo,BindingResult result,@RequestParam String action,Map<String,Object> map){
		
		UserInfo userinfodo=new UserInfo();
		switch(action.toLowerCase()){
		case "add":
		userservice.insertRow(userinfo);
		userinfodo=userinfo;
		}
		
		return "index";
	}
	
//	@RequestMapping(value="/display",method=RequestMethod.POST)
//	
//	public ModelAndView getPage(@RequestParam("fname") String a,@RequestParam("lname") String b,@RequestParam("email") String c  ) {
//      System.out.println("login");
//      ModelAndView mv=new ModelAndView("login");
//      mv.addObject("fname",a);
//      mv.addObject("lname", b);
//      mv.addObject("email", c);
//		return mv;
//	}
//	@RequestMapping("/validate")
//	public ModelAndView validate(@RequestParam("email") String email,@RequestParam("pwd")String pwd){
//		System.out.println("validate methode");
//		ModelAndView mv=new ModelAndView("user");
//		UserDao userDAO=new UserDao();
//		if(userDAO.isValidCredentials(email,pwd)==true){
//			mv.addObject("successmsg","you  logged in successfully");
////			
////		}
////		else{
////			mv.addObject("errormsg","please try again,");
////		}
////		return mv;
//	}
	
}

