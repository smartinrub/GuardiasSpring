package com.sergio.guardiasspringmvc.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergio
 */
@Controller
public class MainController {
    
    @RequestMapping
    public ModelAndView menu() {
        return new ModelAndView("menu");
    }
    
}
