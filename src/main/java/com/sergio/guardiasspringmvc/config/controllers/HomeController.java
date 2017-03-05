package com.sergio.guardiasspringmvc.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergio
 */
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public ModelAndView menu() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("bienvenido", "Bienvenido al Gestor de Guardias");
        mav.setViewName("menu");
        return mav;
    }
    
}
