package edu.mum.cs.cs425.demos.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/eRegistrar", "/eRegistrar/home"})
    public String home() {
        return "home/index";
    }

}
