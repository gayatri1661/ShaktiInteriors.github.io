package com.rakhi.sales.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rakhi.sales.model.Sale;
import com.rakhi.sales.repository.Userrepository;
import com.rakhi.sales.service.Userservice;
import com.rakhi.sales.web.dto.Userregdto;


@Controller
public class Login {
	
	private Userservice userser;	
	
	public Login(Userservice userser) {
		super();
		this.userser = userser;
	}

	@Autowired
	Userrepository Userepository;
	
	@RequestMapping(value="/shaktiinteriors1",method=RequestMethod.GET)
	public String welcomemsg() {
		return "welcome";
	}
	
	@RequestMapping(value="/placeorder",method=RequestMethod.GET)
	public String pics(ModelMap model) {
		return "order";
	}
	
	@RequestMapping(value="/trackorder",method=RequestMethod.GET)
	public String operation() {
		return "order1";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String widpcs() {
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String widpc() {
		return "order";
	}
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String wipcs() {
		return "signup";
	}
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public String register(@ModelAttribute("sale") Userregdto registerdto) {
		userser.save(registerdto);
		return "order";
	}
	
				
	
}
