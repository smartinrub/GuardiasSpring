package com.sergio.guardiasspringmvc.config.controllers;

import com.sergio.guardiasspringmvc.model.Opcion;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sergio
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String initForm(Model model) {
        Opcion opcion = new Opcion();
        model.addAttribute("elegirOpcion", opcion);
        return "menu";
    }

    @PostMapping
    public String processForm(@ModelAttribute("elegirOpcion") @Valid Opcion o, BindingResult result) {
        if (result.hasErrors()) {
            return "menu";
        } else {
            switch (o.getOpcionElegida()) {
                case "A1":
                    return "redirect:/gestionar";
                case "B1":
                    return "B1";
                case "C1":
                    return "C1";
                case "D1":
                    return "D1";
                case "E1":
                    return "E1";
                default:
                    return "menu";
            }
        }
    }
}
