package com.akash.customerapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.akash.customerapp.models.Customer;
@Controller
public class RegisterController {
	@RequestMapping( value="/registers" ,method=RequestMethod.GET)
	public ModelAndView getLoginPage()
	{
		ModelAndView mav=new ModelAndView("customerRegister" ,"customer",new Customer());
		return mav;
	}

}
