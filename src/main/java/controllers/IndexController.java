package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;;


    public class IndexController {
        
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("titulo", "prueba 1");
        
        return "index";
    }






}