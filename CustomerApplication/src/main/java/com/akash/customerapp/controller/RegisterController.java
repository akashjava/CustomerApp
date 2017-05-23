package com.akash.customerapp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.akash.customerapp.vo.CustomerVO;
@Controller
public class RegisterController {
	@InitBinder
	public void initBinder(WebDataBinder wdb)
	{
		SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy");
		wdb.registerCustomEditor(Date.class, "dateOfBirth",new CustomDateEditor(sdf, false));
	}
	@RequestMapping( value="/registers" ,method=RequestMethod.GET)
	public ModelAndView getCustomerRegister()
	{
		ModelAndView mav=new ModelAndView("customerRegister" ,"customervo",new CustomerVO());
		return mav;
	}
	@RequestMapping( value="/custregister" ,method=RequestMethod.POST)
	public ModelAndView getRegister(@Valid @ModelAttribute("customervo") CustomerVO customer,BindingResult br)
	{
		if(br.hasErrors())
		{
			return new ModelAndView("customerRegister");
		}
		else
		{
			return new ModelAndView("success","msg","Registration  Successful");
		}
	}

}
