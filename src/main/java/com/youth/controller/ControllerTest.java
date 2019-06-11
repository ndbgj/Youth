package com.youth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerTest {		
	
	@Value("${com.li.wu}")
	public String cao;
	
	@RequestMapping("/mmp")
    public ModelAndView index(){
		ModelAndView ok=new ModelAndView("/index");
		ok.addObject("welcome",cao);
        return ok;
    }
}
