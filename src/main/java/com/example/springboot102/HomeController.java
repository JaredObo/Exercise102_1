package com.example.springboot102;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("v1","Hello Jared.");
        model.addAttribute("v2","Hello Dr. Henley.");
        return "hometemplate";
    }
}

