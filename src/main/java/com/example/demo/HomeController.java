package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/dowork")
    public String doWorkHomepage(){
        return "keepup";
    }

    @RequestMapping("/processForm")
    public String doWorkHomepage(@RequestParam("login") String login,
                                 Model model){
        model.addAttribute("loginval", login);
        return "confirm";
    }
}
