package com.sergio.guardiasspringmvc.config.controllers;

import com.sergio.guardiasspringmvc.model.Opcion;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sergio
 */
@Controller
public class HomeController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String menu(Model model) {
        model.addAttribute("bienvenido", "Bienvenido al Gestor de Guardias");
        Opcion opcion = new Opcion();
        model.addAttribute("opcionElegida", opcion);
        return "menu";
    }
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String processFormOpcion(@Valid @ModelAttribute("opcionElegida") Opcion o) {
        String page = "";
        switch(o.getName()) {
            case "A1":
              page = "a1";
        }
        return page;
    }
}
