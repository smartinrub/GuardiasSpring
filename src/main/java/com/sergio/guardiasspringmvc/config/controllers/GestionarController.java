package com.sergio.guardiasspringmvc.config.controllers;

import com.sergio.guardiasspringmvc.model.Hora;
import com.sergio.guardiasspringmvc.model.Profesor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergio
 */
@Controller
@SessionAttributes("horaSesion") //nombre variables de sesion
public class GestionarController {

    @Autowired
    private List<Profesor> listaProfesores;

    @GetMapping(value = "/gestionar")
    public String horaForm(Model model) {
        Hora hora = new Hora();
        model.addAttribute("horaForm", hora);
        return "A1";
    }

    @PostMapping(value = "/gestionar")
    public String processHoraForm(@ModelAttribute("horaForm") Hora hora, Model model) {
        model.addAttribute("horaSesion", hora); //con esto guardamos 
        //automaticamente variable en sesion, ya que el nombre coincide 
        //con el dado en la etiqueta SessionAttributes
        return "redirect:/profesor";
    }

    @RequestMapping(value = "/profesor", method = RequestMethod.GET)
    public ModelAndView showProfesoresHora(@ModelAttribute("horaSesion") /*Recogemos variable de sesion*/ Hora hora) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("getHora", hora.getName());
        mav.addObject("profesores", listaProfesores);
        Profesor profesor = new Profesor();
        mav.addObject("profesorForm", profesor);
        mav.setViewName("A2");
        return mav;
    }

    @RequestMapping(value = "/profesor", method = RequestMethod.POST)
    public String processProfesorForm() {
        return "menu";
    }

}
