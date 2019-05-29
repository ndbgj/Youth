package com.youth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerTest {		
		
	@RequestMapping("/mmp")
    public ModelAndView index(){
		ModelAndView ok=new ModelAndView("/index");
		ok.addObject("welcome","nmm");
        return ok;
    }
}
