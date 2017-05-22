package com.akash.customerapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.akash.customerapp.dao.LoginDao;
import com.akash.customerapp.models.Login;

@Controller
public class LoginController {
	@Autowired
	private LoginDao dao;
	@RequestMapping( value="/logins" ,method=RequestMethod.GET)
	public ModelAndView getLoginPage()
	{
		ModelAndView mav=new ModelAndView("login","log",new Login());
		return mav;
	}
	@RequestMapping( value="/logincheck" ,method=RequestMethod.POST)
	public ModelAndView checkLogin(@ModelAttribute("login") Login login)
	{
		String uname=login.getUserName();
		String pass=login.getPassword();
		boolean flag=dao.checkUser(  uname,  pass);
		String s1=null;
		if (flag==true)
			s1="success";
		else
			s1="faliure";
		return new ModelAndView(s1);
	}

}
