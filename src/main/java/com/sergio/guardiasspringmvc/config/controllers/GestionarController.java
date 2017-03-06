package com.sergio.guardiasspringmvc.config.controllers;

import com.sergio.guardiasspringmvc.model.Hora;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergio
 */
@Controller
@SessionAttributes("horaSesion") //nombre variables de sesion
public class GestionarController {

    @GetMapping(value = "/gestionar")
    public String initForm(Model model) {
        Hora hora = new Hora();
        model.addAttribute("horaForm", hora);
        return "A1";
    }

    @PostMapping(value = "/gestionar")
    public String processForm(@ModelAttribute("horaForm") Hora hora, Model model) {
        model.addAttribute("horaSesion", hora); //con esto guardamos 
        //automaticamente variable en sesion, ya que el nombre coincide 
        //con el dado en la etiqueta SessionAttributes
        return "redirect:/profesor";
    }

    @RequestMapping(value="/profesor")
    public ModelAndView showProfesoresHora(@ModelAttribute("horaSesion") 
            /*Recogemos variable de sesion*/ Hora hora) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("getHora", hora.getName());
        mav.setViewName("A2");
        return mav;
    }
}
